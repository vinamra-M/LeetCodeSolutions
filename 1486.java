class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = start + 2*i;
        }
        if(n == 1) return nums[0];
        int result = nums[0] ^ nums[1];
        if(n == 2) return result;
        for(int i = 2; i < n; i++){
            result^=nums[i];
        }
        return result;
    }
}
