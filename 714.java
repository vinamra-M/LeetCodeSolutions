class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = 0;
        int[][] dp = new int[n][2];
        return solve(prices,fee,0,0,dp);
    }

    public int solve(int[] prices, int fee, int index, int bought,int[][] dp){
        if(index == prices.length) return 0;
        if(dp[index][bought] != 0) return dp[index][bought];
        if(bought == 0){
            int take = solve(prices,fee,index+1,bought+1,dp) - prices[index];
            int notTake = solve(prices,fee,index+1,bought,dp);
            return dp[index][bought] = Math.max(take,notTake);
        }
        else{
            int sell = solve(prices,fee,index+1,bought-1,dp)+prices[index]-fee;
            int notSell = solve(prices,fee,index+1,bought,dp);
            return dp[index][bought] = Math.max(sell,notSell);
        }
    }
}
