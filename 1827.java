class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]<=prev){
                ans+=prev-nums[i]+1;
                prev = prev+1;
            }
            else{
                prev = nums[i];
            }

        }
        return ans;
    }
}
