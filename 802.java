class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                if (dfs(graph, i, visited))
                    ans.add(i);          
        }
        return ans;
    }
    private static boolean dfs(int[][] graph, int x, int[] visited) {
        if(visited[x] != 0) return visited[x] == 1;
        visited[x] = 2;
        for (int i = 0; i < graph[x].length; i++) {
            if (!dfs(graph, graph[x][i], visited))
                return false;
        }
        visited[x] = 1;
        return true;
    }
}
