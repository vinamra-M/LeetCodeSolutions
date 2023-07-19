class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));

        int remove = 0;
        int end = Integer.MIN_VALUE;

        for(int[] i : intervals){
            if(i[0] >= end){
                end = i[1];
            }
            else
                remove++;
        }
        return remove;
    }
}
