class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i: nums) total+=i;
        if(total%2 == 1) return false;

        int sum = total/2;
        int n = nums.length;
        return answer(nums,sum);
    }
    public boolean answer(int[] nums, int target){
        boolean[][] dp = new boolean[nums.length+1][target+1];

        for(int j = 0; j < target+1; j++){
            dp[0][j] = false;
        }
        for(int i = 0; i < nums.length+1; i++){
            dp[i][0] = true;
        }
        for(int i = 0; i < nums.length+1; i++){
            for(int j = 0; j < target+1; j++){
                if(i == 0 || j == 0) continue;
                else if(nums[i-1] <= j) dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else dp[i][j] = dp[i-1][j];         
            }
        }
        return dp[nums.length][target];
    }
}
