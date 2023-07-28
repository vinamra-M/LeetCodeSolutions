class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return backtrack(nums,0,dp);
    }

    public int backtrack(int[] nums, int i, int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        int a = backtrack(nums,i+2,dp)+nums[i];
        int b = backtrack(nums,i+1,dp);
        dp[i] = Math.max(a,b);
        return dp[i];
    }
}
