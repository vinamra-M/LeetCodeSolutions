class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int count = 0;
        int curr = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(curr == Integer.MIN_VALUE){ 
                curr = nums[i];
                count++;
                index++;
                continue;
            }
            else if(nums[i] == curr){
                count++;
                if(count<=2) {
                    if(index < i) nums[index] = nums[i];
                    index++;
                    continue;
                }
            }
            else{
                if(index < i){
                    nums[index] = nums[i];
                }
                count = 1;
                curr = nums[i];
                index++;
            } 
        }
        return index;
    }
}
