class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] count = new int[strs.length][2];
        Integer[][][] dp = new Integer[m+1][n+1][strs.length];
        for(int i = 0; i < strs.length; i++){
            count[i][0] = count('0',strs[i]);
            count[i][1] = count('1',strs[i]);
        }
        return solve(strs,m,n,0,count, dp);
    }

    public int solve(String[] strs, int m, int n, int index, int[][] count, Integer[][][] dp){
        if(m < 0 || n < 0 || index >= strs.length) return 0;
        if(dp[m][n][index] != null) return dp[m][n][index];

        if(count[index][0] <= m && count[index][1] <= n){
            int take = 1 + solve(strs,m-count[index][0],n-count[index][1],index+1,count,dp);
            int notTake = solve(strs,m,n,index+1,count,dp);
            return dp[m][n][index]=Math.max(take,notTake);
        }
        else{
            int notTake = solve(strs,m,n,index+1,count,dp);
            return dp[m][n][index]=notTake;
        }
    }

    public int count(char search, String input){
        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
            count++;
        }
        return count;
    }
}
