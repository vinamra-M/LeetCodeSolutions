class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on start times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);
            
            if (currentInterval[0] <= lastMerged[1]) {
                // Overlapping intervals, update the end time
                lastMerged[1] = Math.max(lastMerged[1], currentInterval[1]);
            } else {
                // Non-overlapping interval, add to merged list
                merged.add(currentInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
        
    }
}
