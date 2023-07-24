class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for(int i : nums)total+=i;
        if(target < 0) target*=-1;
        int subset = target + total;
        if(subset%2 == 1) return 0;
        subset/=2;
        // if(subset < 0) subset*=-1;
        int[][] dp = new int[n+1][subset+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < subset+1; i++){
            dp[0][i] = 0;
        }
        dp[0][0] = 1;
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j <= subset;j++){
                if(i == 0 || j == 0) continue;
                else if(nums[i-1] == 0) dp[i][j] = dp[i-1][j];
                else if(nums[i-1] <= j) dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                else dp[i][j] = dp[i-1][j];
            }
        }
        int mul = 1;
        for(int i: nums){
            if(i == 0) mul*=2;
        }
        return dp[n][subset]*mul;
    }

}
