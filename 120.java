class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] arr: dp)
            Arrays.fill(arr,Integer.MAX_VALUE);
        return dfs(0,0,triangle,dp);
    }

    private int dfs(int level, int i, List<List<Integer>> triangle, int[][] dp){
        if(dp[level][i] != Integer.MAX_VALUE) return dp[level][i];
        int path = triangle.get(level).get(i);

        if(level < triangle.size()-1)
            path+=Math.min(dfs(level+1,i,triangle,dp),dfs(level+1,i+1,triangle,dp));
        
        return dp[level][i]=path;
    }
}
