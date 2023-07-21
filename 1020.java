class Solution {
    int row;
    int col;
    public int numEnclaves(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;

        for(int r = 0; r < row; r++){
            if(grid[r][0] == 1)
                dfs(r,0,grid);
            if(grid[r][col-1] == 1)
                dfs(r,col-1,grid);
        }
        for(int c = 0; c < col; c++){
            if(grid[0][c] == 1)
                dfs(0,c,grid);
            if(grid[row-1][c] == 1)
                dfs(row-1,c,grid);
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1)
                    count++;
            }
        }
        return count;
    }

    public void dfs(int r, int c, int[][] grid){
        if(r<0 || r >=row || c <0 || c>=col || grid[r][c] != 1) return;
        grid[r][c] = 0;

        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
    }
}
