class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            color[i] = -1;
        }
        for(int i = 0; i < graph.length; i++){
            if(color[i] == -1){
                if(util(graph, color, i) == false) return false;
            }
        }
        return true;
    }

    public boolean util(int[][] graph, int[] color, int i){
        color[i] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : graph[u]){
                if(color[v] == -1){
                    color[v] = 1 - color[u];
                    q.offer(v);
                }
                else if(color[v] == color[u]) return false;
            }
        }
        return true;
    }
}
