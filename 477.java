class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        int len = nums.length;
        for(int i = 0; i < 32; i++){
            int one = 0;
            for(int j = 0; j < len; j++){
                one+= (nums[j]>>i)&1;
            }
            result+= one*(len-one);
        }
        return result;
    }
}
