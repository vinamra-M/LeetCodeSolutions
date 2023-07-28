class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;

        int max = 0;
        for(int i: nums)
            max = Math.max(max,i);
        
        int[] quant = new int[max+1];
        for(int i: nums)
            quant[i]++;
        Integer[] dp = new Integer[max+1];

        return solve(quant, 1,dp);
    }

    public int solve(int[] quant, int i,Integer[] dp){
        if(i >= quant.length) return 0;
        if(dp[i] != null) return dp[i];

        int take = quant[i]*i+solve(quant,i+2,dp);
        int notTake = solve(quant,i+1,dp);

        return dp[i] = Math.max(take,notTake);
    }
}
