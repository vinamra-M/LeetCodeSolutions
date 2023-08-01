class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ans = new int[m][n];
        for(int[] row: ans){
            Arrays.fill(row,-1);
        }
        for(int i = 0; i < n; i++){
            ans[0][i] = 0;
        }
        for(int i = 0; i < m; i++){
            ans[i][0] = 0;
        }
        for(int i = 0; i < n; i++){
            if(obstacleGrid[0][i] == 0) ans[0][i] = 1;
            else if(obstacleGrid[0][i] == 1){
                ans[0][i] = 0;
                break;
            }
        }
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 0) ans[i][0] = 1;
            else if(obstacleGrid[i][0] == 1){
                ans[i][0] = 0;
                break;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1) ans[i][j] = 0;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(ans[i][j] != 0) ans[i][j] = ans[i-1][j] + ans[i][j-1];
            }
        }

        return ans[m-1][n-1];
    }
}
