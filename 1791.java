class Solution {
    public int findCenter(int[][] edges) {
        int x = edges.length;
        int[] arr = new int[x+2];
        for(int i = 0; i < x; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            arr[a]+=1;
            arr[b]+=1;
        }
        for(int i = 1; i < x+2; i++){
            if(arr[i] == x) return i;
        }
        return 0;
    }
}
