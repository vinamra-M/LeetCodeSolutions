class Solution {
    public int numSquares(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= n; i++) list.add(i*i);
        Integer[][] dp = new Integer[n+1][list.size()];
        return solve(n,0,list,dp);
   
    }

    public int solve(int n, int index, List<Integer> list, Integer[][] dp){
        if(n == 0) return 0;
        if(n < 0 || index >= list.size()) return Integer.MAX_VALUE-50;
        if(dp[n][index] != null) return dp[n][index];
        int take = Integer.MAX_VALUE;
        int notTake = solve(n,index+1,list,dp);
        if(list.get(index) <= n){
            take = 1 + solve(n - list.get(index),index,list,dp);
        }
        return dp[n][index] = Math.min(take,notTake);
    }
}
