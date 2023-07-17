class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(j < nums.length){
            sum+=nums[j];
            while(sum >= target){
                sum-=nums[i];
                ans = Math.min(j-i+1,ans);
                i++;
            }
            j++;
        }
        if(ans == Integer.MAX_VALUE) return 0;
        else return ans;
        
    }
}
