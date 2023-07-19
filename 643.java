class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ans = 0;
        double curr = 0;
        for(int i = 0; i < k; i++){
            curr+=nums[i];
            ans+=nums[i];
        }
        for(int i = k; i < n; i++){
            double temp = curr + (double)nums[i] - (double)nums[i-k];
            ans = Math.max(ans, temp);
            curr = temp; 
        }
        return ans/k;
    }
}
