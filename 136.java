class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int result= nums[0]^nums[1];
        if(nums.length == 2) return result;
        for(int i = 2; i < nums.length; i++){
            result^=nums[i];
        }
        return result;
    }
}
