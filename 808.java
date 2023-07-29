class Solution {
    public double soupServings(int n) {
        if(n >= 4800) return 1.0;
        double[][] dp = new double[n+1][n+1];

        return solve(n,n,dp);
    }
    public double solve(int a, int b,double[][] dp){
        if(a <= 0 && b > 0) return 1.0;
        else if(a <= 0 && b <= 0) return 0.5;
        else if(b <= 0) return 0;
        if(dp[a][b] != 0) return dp[a][b];

return dp[a][b] = 0.25*solve(a-100,b,dp)+0.25*solve(a-75,b-25,dp)+0.25*solve(a-50,b-50,dp)+0.25*solve(a-25,b-75,dp);
        
    }
}
