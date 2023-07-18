class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--) {
            if(i == n-1) dp[i] = cost[i];
            else dp[i] = Math.min(dp[i+1],dp[i+2]) + cost[i];
        }
        return Math.min(dp[0],dp[1]);
    }
}
