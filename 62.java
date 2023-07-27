int[][] ans = new int [m][n];
        for(int row = 0 ; row<m ; row++){
            for(int col =0 ; col<n; col++){
                if(row==0 || col==0){
                    ans[row][col]=1;
                }else{
                    ans[row][col] = ans[row-1][col] + ans[row][col-1]; 
                }
            }
        }
        return ans[m-1][n-1];
