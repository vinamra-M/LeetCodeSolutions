class Solution {
    public boolean canFinish(int n, int[][] pre) {
        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < pre.length; i++) {
            x = pre[i][1];
            y = pre[i][0];
            adj[x].add(y);
        }
         int[] visited = new int[adj.length];
        int[] recStack = new int[adj.length];
        for (int i = 0; i < adj.length; i++) {
            if (visited[i] == 0) {
                if (dfs(adj, i, visited, recStack) == 1)
                    return false;
            }
        }
        return true;
    }

    private static int dfs(ArrayList<Integer>[] adj, int x, int[] visited, int[] recStack) {
        visited[x] = 1;
        recStack[x] = 1;
        for (int i = 0; i < adj[x].size(); i++) {
            if (visited[adj[x].get(i)] == 0 && dfs(adj, adj[x].get(i), visited, recStack) == 1)
                return 1;
            else if (recStack[adj[x].get(i)] == 1)
                return 1;
        }
        recStack[x] = 0;
        return 0;
    }
}
