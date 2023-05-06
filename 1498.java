class Solution {
    public int numSubseq(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = 0;
        Arrays.sort(nums);

        while(i <= j)
        {
            if(nums[i] + nums[j] > target){
                j--;
              
            }
            else{
                ans = (ans + pow(2,j-i,1000000007))%(1000000007);
                i++;
            }
        }
        return ans;
        
    }
 
private int pow(int x, int n, int mod) {
    int res = 1;
    while (n > 0) {
        if ((n & 1) == 1) {
            res = (int)((long)res * x % mod);
        }
        x = (int)((long)x * x % mod);
        n >>= 1;
    }
    return res;
}


}

// This approach is known as the binary exponentiation algorithm, and it allows us to compute x raised to the power of n in O(log n) time using only multiplication and modulo operations.



