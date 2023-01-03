class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int row = 0;row < accounts.length;row++){
            int j = 0;
            for(int col: accounts[row]){
                j+=col;
            }
            if(j>ans){
                ans = j;
            }

        }
        return ans;
    }
}
