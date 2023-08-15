class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] row = {0,0,1,1,1,-1,-1,-1};
        int[] col = {1,-1,-1,0,1,-1,0,1};
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
            {
                // int countAlive = solve(board,i,j);
                // int countDead = solver(board,i,j);
                int countAlive = 0;
                for(int k = 0; k < 8; k++){
                    int newRow = i + row[k];
            int newCol = j + col[k];
            if(newRow < board.length && newRow >= 0 && newCol < board[0].length && newCol >= 0 && (board[newRow][newCol] == 1 || board[newRow][newCol] == 2)) countAlive++;
        }

                if(board[i][j] == 1){
                    if(countAlive < 2) board[i][j] = 2; //initial 1 afterwards 0
                    else if(countAlive > 3) board[i][j] = 2; //initial 1 afterwards 0
                } else {
                    if(countAlive == 3) board[i][j] = 3; //initial 0 afterwards 3
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 2) board[i][j] = 0;
                if(board[i][j] == 3) board[i][j] = 1;
            }
        }
    }

    public int solve(int[][] board, int i, int j){
        int[] row = {0,0,1,1,1,-1,-1,-1};
        int[] col = {1,-1,-1,0,1,-1,0,1};
        int count = 0;
        for(int k = 0; k < 8; k++){
            int newRow = i + row[k];
            int newCol = j + col[k];
            if(newRow < board.length && newRow >= 0 && newCol < board[0].length && newCol >= 0 && (board[newRow][newCol] == 1 || board[newRow][newCol] == 2)) count++;
        }
        return count;
    }
}
