class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int total = 0;
        for(int i: nums)
            total+=i;
        int[][] dp = new int[nums.length][nums.length];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        int P1 = solve(0,nums.length-1,nums,dp);
        return 2*P1 >= total;
    }

    public int solve(int start, int end, int[] nums, int[][] dp){
        if(start > end) return 0;
        if(dp[start][end] != -1) return dp[start][end];
        int first = nums[start] + Math.min(solve(start+2,end,nums,dp),solve(start+1,end-1,nums,dp));
        int last = nums[end] + Math.min(solve(start+1,end-1,nums,dp),solve(start,end-2,nums,dp));

        return dp[start][end] = Math.max(first,last);
    }
}
