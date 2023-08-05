class Solution {
    int answer;
    public int jump(int[] nums) {
        if(nums.length <= 1) return 0;
        answer = nums.length;
        Integer[] dp = new Integer[nums.length];
        solve(nums,0,dp);
        return answer;
    }

    public int solve(int[] nums, int index, Integer[] dp){
        if(index >= nums.length-1)return 0;
        if(dp[index]!= null) return dp[index];
        for(int j = 1; j <= nums[index]; j++){
            answer = Math.min(answer,1 + solve(nums,index+j,dp));
        }
        return dp[index] = answer;
    }
}
