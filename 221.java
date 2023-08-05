class Solution {
    int max = 0;
    public int maximalSquare(char[][] matrix) {
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];
        solve(matrix,0,0,dp);
        return max*max;
    }

    public int solve(char[][] matrix, int i, int j, Integer[][] dp){
        if(i >= matrix.length || j >= matrix[0].length) return 0;
        if(dp[i][j] != null) return dp[i][j];
        int bottom = solve(matrix,i,j+1,dp);
        int diagonal = solve(matrix,i+1,j+1,dp);
        int right = solve(matrix,i+1,j,dp);
        int ans = 0;
        if(matrix[i][j] == '1'){
            ans = 1 + Math.min(right, Math.min(diagonal,bottom));
            max = Math.max(max,ans);
        }
        else return dp[i][j] = 0;
        return dp[i][j] = ans;
    }
}
