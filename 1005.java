class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(k == 0) break;
            if(nums[i] < 0){
                nums[i] = -1 * nums[i];
                k--;
            }
            else if(nums[i] >= 0) break;
        }
        int ans = 0;
        if(k == 0){
            for(int i = 0; i < nums.length; i++){
                ans+=nums[i];
            }
            return ans;
        }
        else if(k%2 == 1){
            Arrays.sort(nums);
            nums[0] = -1*nums[0];
            for(int i = 0; i < nums.length; i++){
                ans+=nums[i];
                }
            return ans;
        }
        else{
            for(int i = 0; i < nums.length; i++){
                ans+=nums[i];
            }
            return ans;
        }
    }
}
