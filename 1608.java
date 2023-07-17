class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = n;
        if(nums[0] >= ans) return ans;
        ans--;
        for(int i = 1; i < n; i++){
            if(nums[i] >= ans && nums[i-1] < ans) return ans;
            else ans--;
        }
        return -1;
    }
}
