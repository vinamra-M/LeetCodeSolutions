class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer, ArrayList<Integer>> row = new HashMap<>();
        Map<Integer, ArrayList<Integer>> column = new HashMap<>();

        int n = grid.length;

        for(int i = 0; i < n; i++){
            row.put(i, new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
           column.put(i, new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row.get(i).add(grid[i][j]);
                column.get(j).add(grid[i][j]);
            }
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(row.get(i).equals(column.get(j))){
                    ans++;
                }
            }
        }
        return ans;        
    }
}
