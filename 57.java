class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];

        int sI = -1;
        int eI = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= start) {
                sI = i;
                break;
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > end) {
                eI = i - 1;
                break;
            }
        }
        if(intervals.length > 0 && newInterval[1] < intervals[0][0]){
            int[][] ans = new int[intervals.length+1][2];
            ans[0] = newInterval;
            System.arraycopy(intervals,0,ans,1,intervals.length);
            return ans;
        }
        if (eI == -1) {
            eI = intervals.length - 1;
        }

        if (sI == -1) {
            int[][] ans = new int[intervals.length + 1][2];
            ans[intervals.length] = newInterval;
            System.arraycopy(intervals, 0, ans, 0, intervals.length);
            return ans;
        } else {
            int mergedStart = Math.min(intervals[sI][0], start);
            int mergedEnd = Math.max(intervals[eI][1], end);
            int newLength = intervals.length - (eI - sI + 1) + 1;

            int[][] ans = new int[newLength][2];
            System.arraycopy(intervals, 0, ans, 0, sI);
            ans[sI] = new int[]{mergedStart, mergedEnd};
            System.arraycopy(intervals, eI + 1, ans, sI + 1, intervals.length - (eI + 1));
            return ans;
        }
    }
}
