class Solution {
    public int maxProfit(int[] prices) {
        int k = 2;
        Integer[][][] dp = new Integer[prices.length][2][k+1];
        return solve(prices,k,0,0,dp);
    }

    public int solve(int[] prices, int k, int index, int bought, Integer[][][] dp){
        if(index >= prices.length) return 0;
        if(k == 0) return 0;
        if(dp[index][bought][k] != null) return dp[index][bought][k];
        if(bought == 0){
            int take = solve(prices,k,index+1,1,dp) - prices[index];
            int notTake = solve(prices,k,index+1,0,dp);

            return dp[index][bought][k] = Math.max(take,notTake);
        }else{
            int sell = solve(prices,k-1,index+1,0,dp)+prices[index];
            int notSell = solve(prices,k,index+1,1,dp);
            return dp[index][bought][k] = Math.max(sell,notSell);
        }
    }
}
