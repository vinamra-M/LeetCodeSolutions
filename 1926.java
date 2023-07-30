class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[][] move = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
         visited[entrance[0]][entrance[1]]=true;
        queue.offer(entrance);

        while(!queue.isEmpty()){
            int size = queue.size();
            answer++;
            for(int i = 0; i < size; i++){
                int[] temp = queue.poll();

                for(int[] step: move){
                    int x = temp[0] + step[0];
                    int y = temp[1] + step[1];
                    if(x >= 0 && x < m && y >= 0 && y < n && visited[x][y] == false && maze[x][y] == '.'){
                        queue.offer(new int[]{x,y});
                        if(x == 0 || y == 0 || x == m-1 || y == n-1){
                            return answer;
                        }
                        visited[x][y] = true;
                    }
                }
            }
        }
        return -1;       
    }
}
