class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < amount+1; i++){
            dp[0][i] = 0;
        }
        dp[0][0] = 1;

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < amount+1; j++){
                if(i == 0 || j == 0) continue;
                else if(coins[i-1] <= j)
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][amount];
    }
}
