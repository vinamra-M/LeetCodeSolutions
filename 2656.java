class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int a = max+k-1;
        int ans = a*(a+1)/2;
        int b = max-1;
        ans-= b*(b+1)/2;
        return ans;
        
    }
}

//can iterate through loop
