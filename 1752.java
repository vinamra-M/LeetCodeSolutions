class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int rot = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[(i+1)]){
                rot++;
            }
        }
        if(nums[n-1] > nums[0]) rot++;
        
        if(rot > 1) return false;

        return true;
    }
}
