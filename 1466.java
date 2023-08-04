class Solution {
    public int minReorder(int n, int[][] connections) {
        ArrayList<int[]>[] a = new ArrayList[n];
        for(int i=0;i<n;i++){
            a[i] = new ArrayList<>();
        }

        for(int[] x : connections){
            a[x[0]].add(new int[]{x[1],1});
            a[x[1]].add(new int[]{x[0],0});
        }
        boolean[] visited = new boolean[n];
        return dfs(a,0,visited);
    }

    public int dfs(ArrayList<int[]>[] a, int x, boolean[] visited){
        visited[x] = true;
        int ans = 0;
        for(int[] y: a[x]){
            if(!visited[y[0]]){
                ans+=dfs(a,y[0],visited)+y[1];
            }
        }
        return ans;
    }
}
