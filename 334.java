class Solution {
    public boolean increasingTriplet(int[] nums) {
        int max1 = nums[0];
        int max2 = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= max1) max1 = nums[i];
            else if(nums[i] <= max2) max2 = nums[i];
            else return true;
        }
        return false;
        
    }
}
