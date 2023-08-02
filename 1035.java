class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        Integer[][] dp = new Integer[nums1.length][nums2.length];
        return solve(nums1,nums2,0,0,dp);
    }

    public int solve(int[] nums1, int[] nums2, int i, int j,Integer[][] dp){
        if(i >= nums1.length || j >= nums2.length) return 0;
        if(dp[i][j] != null) return dp[i][j];

        if(nums1[i] == nums2[j]) return dp[i][j] = 1 + solve(nums1,nums2,i+1,j+1,dp);
        else{
            int one = solve(nums1,nums2,i+1,j,dp);
            int two = solve(nums1,nums2,i,j+1,dp);
            return dp[i][j] = Math.max(one,two);
        }
    }
}
