class Solution {
    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()];
        return solve(s,0,dp);
    }

    public int solve(String s, int index, Integer[] dp){
        if(index >= s.length()) return 1;
        if(dp[index] != null) return dp[index];

        char ch = s.charAt(index);
        if(ch == '0') return 0;
        int ans = solve(s,index+1,dp);
        if(index == s.length()-1) return 1;
        if(Integer.parseInt(s.substring(index,index+2)) <= 26) ans += solve(s,index+2,dp);

        return dp[index] = ans;
    }
}
