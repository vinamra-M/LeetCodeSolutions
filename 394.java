class Solution {
    public int longestSubarray(int[] nums) {
        int index = 0;
        int max = 0;
        int delete = 0;
        int count = 0;
        int sum = 0;
        for(int i: nums) sum+=i;
        if(sum == nums.length) return sum-1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) count++;
            else{
                if(delete == 0){
                    delete = 1;
                    index = i;
                }
                else{
                    max = Math.max(count,max);
                    count = i - index - 1;
                    index = i;
                }
            }
        }
        return Math.max(max,count);
        
    }
}
