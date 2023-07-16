class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] x = new int[n+1];
        int[] y = new int[n+1];

        for(int i = 0; i < trust.length; i++){
            x[trust[i][0]] = 1;
        }
        int count = 0;
        for(int i = 1; i < n+1; i++){
            if(x[i] == 1) count++;
            else y[i] = 1;
        }
        if(count == n) return -1;
        int ans = 0;
        for(int i = 1; i < n+1; i++){
            if(y[i] == 1){
                ans = i;
                break;
            }
        }
        int c = 0;
        for(int i = 0; i < trust.length; i++){
            if(trust[i][1] == ans) c++;
        }
        if(c == n-1) return ans;
        return -1;
    }
}
