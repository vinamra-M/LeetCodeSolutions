class Solution {
    int mod = 1000000007;
    public int numMusicPlaylists(int n, int goal, int k) {
        Integer[][] dp = new Integer[n+1][goal+1];
        return (int)solve(n,goal,k,dp);
    }

    public long solve(int n, int goal, int k,Integer[][] dp){
        if(n == 0 && goal == 0) return 1;
        if(n == 0 || goal == 0) return 0;
        if(dp[n][goal] != null) return dp[n][goal];

        long notRepeat = solve(n-1,goal-1,k,dp)*n;
        long repeat = solve(n,goal-1,k,dp)*Math.max(n-k,0);
        return dp[n][goal] = (int)(notRepeat%mod + repeat%mod)%mod;
    }
}
