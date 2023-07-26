class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String s2 = "";
        char ch;
         for (int i=0; i<n; i++)
      {
        ch= s.charAt(i); 
        s2= ch+s2;
      }
        return minDistance(s,s2);
    }

    public int minDistance(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        int[][] dp = new int[a+1][b+1];
        for(int i = 0; i < a+1; i++){
            dp[i][0] = i;
        }
        for(int i = 0; i < b+1; i++){
            dp[0][i] = i;
        }

        for(int i = 1; i < a+1; i++){
            for(int j = 1; j < b+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1+ Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[a][b]/2;
        
    }
}
