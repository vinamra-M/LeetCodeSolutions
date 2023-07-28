class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int total = 0;
        for(int i: piles)
            total+=i;
        int[][] dp = new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        int maxP = solve(0,n-1,piles,dp);
        return 2*maxP > total; 
    }

    public int solve(int start,int end, int[] piles,int[][] dp){
        if(start>end)return 0;
        if(dp[start][end] != -1) return dp[start][end];

        int first = piles[start]+Math.min(solve(start+2,end,piles,dp),solve(start+1,end-1,piles,dp));
        int last = piles[end]+Math.min(solve(start+1,end-1,piles,dp),solve(start,end-2,piles,dp));

        return dp[start][end] = Math.max(first,last);
    }
}
