class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i: nums) total+=i;

        if(total - nums[0] == 0) return 0;
        // if(total - nums[nums.length-1] == 0) return nums.length - 1;
        float sum = 0;
        int index = -1;
        for(int i = 0; i < nums.length-1; i++){
            sum+=nums[i];
            if(sum == (float)(total-nums[i+1])/2){
                index = i + 1;
                break;
            }
        }
        return index;
    }
}
