class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int start = 0;
        int end = nums[n] - nums[0];
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(solve(nums,mid) >= p) {
                end = mid-1;
                ans = mid;
            }
            else start = mid+1;
        }
        return ans;
    }

    public int solve(int[] nums, int mid){
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]-nums[i-1] <= mid){
                count++;
                i++;
            }
        }
        return count;
    }
}
