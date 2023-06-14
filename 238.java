class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int[] a = new int[len];
        int[] b = new int[len];
        a[0] = nums[0];
        b[len - 1] = nums[len - 1];

        for(int i = 1; i < len; i++){
            a[i] = a[i-1]*nums[i];
        }
        for(int i = len-2; i >= 0; i--){
            b[i] = b[i+1]*nums[i];
        }
        ans[0] = b[1];
        ans[len-1] = a[len-2];
        if(len == 1 || len == 2) return ans;
        for(int i = 1; i < len-1; i++){
            ans[i] = a[i-1]*b[i+1];
        }
        return ans;
    }
}
