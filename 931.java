class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Integer dp[][]=new Integer[101][101];
        
        int min = Integer.MAX_VALUE;
        for(int j = 0 ; j < n ; j++)
            min = Math.min(min , solve(matrix , m , n , 0 , j , dp));
        return min;
    }
    
    public int solve(int[][] matrix , int m , int n , int r , int c , Integer[][] dp){
        if(r>=m || c<0 || c>=n)
            return Integer.MAX_VALUE-10000;
        
        if(dp[r][c] != null)
            return dp[r][c];
        
        if(r == m-1){
            return matrix[r][c];
        }
        
        int dLeft = matrix[r][c] + solve(matrix , m , n , r+1 , c-1 , dp);
        int d = matrix[r][c] + solve(matrix , m , n , r+1 , c , dp);
        int dRight = matrix[r][c] + solve(matrix , m , n , r+1 , c+1 , dp);
        
        return dp[r][c] = Math.min(dLeft , Math.min(d , dRight));
    }
}

//int[][] fails for a single test case. Prolly constant time to initialize the array to -1.
