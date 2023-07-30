class Solution {
    public int numTilings(int n) {
        long[] dp = new long[n+1];
        return (int)solve(n,dp) % 1000000007;        
    }
    public long solve(int n,long[] dp){
        if(n == 0) return 1;
        if(n < 3) return n;
        if(dp[n] != 0) return dp[n];

        return dp[n] = 2*solve(n-1,dp)%1000000007 + solve(n-3,dp)%1000000007;
    }
}
