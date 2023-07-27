class Solution {
    public int minPathSum(int[][] grid) {
        /*
        int m = grid.length;
        int n = grid[0].length;
        int[][] matrix = new int[m][n];
        for (int[] row: matrix)
            Arrays.fill(row, Integer.MAX_VALUE);
        matrix[0][0] = grid[0][0];

        bfs(grid,matrix, 0, 0, m, n, 0);

        return matrix[m-1][n-1];
        */
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j){
                if(i == 0 && j == 0)
                    continue;
                if(i == 0)
                    grid[i][j] += grid[i][j-1];
                else if(j == 0)
                    grid[i][j] += grid[i-1][j];
                else
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];

    }
/*
    public void bfs(int[][] grid, int[][] matrix, int i, int j, int m, int n, int prev){
        if(i >= m || j >= n) return;
        int a = grid[i][j];
        matrix[i][j] = Math.min(matrix[i][j],a+prev);

        bfs(grid,matrix,i+1,j,m,n,matrix[i][j]);
        bfs(grid,matrix,i,j+1,m,n,matrix[i][j]);
    }
*/
}

// commented code works but TLE.
