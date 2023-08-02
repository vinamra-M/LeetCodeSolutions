class Solution {
    public int maxProfit(int[] prices) {
        int bought = 0;
        int[][] dp = new int[prices.length][2];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(prices,bought,0, dp);
    }

    public int solve(int[] prices, int bought, int index, int[][] dp){
        if(index >= prices.length) return 0;

        if(dp[index][bought] != -1) return dp[index][bought];

        if(bought == 0){
            int take = solve(prices, 1, index+1,dp) - prices[index];
            int notTake = solve(prices, 0, index+1,dp);
            return dp[index][bought] = Math.max(take,notTake);
        }
        else{
            int take = solve(prices, 0,index+2,dp) + prices[index];
            int notTake = solve(prices,1,index+1, dp);
            return dp[index][bought] = Math.max(take,notTake);
        }
    }
}
