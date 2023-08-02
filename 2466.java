class Solution {
    int mod = 1000000007;
    
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ans = 0;
        Integer[] dp = new Integer[high + 1];
        
        for (int i = low; i <= high; i++) {
            ans = (ans + solve(i, zero, one, dp)) % mod;
        }
        
        return ans;
    }

    public int solve(int length, int zero, int one, Integer[] dp) {
        if (length == 0) return 1;
        if (length < 0) return 0;
        if (dp[length] != null) return dp[length];

        int takeZero = solve(length - zero, zero, one, dp) % mod;
        int takeOne = solve(length - one, zero, one, dp) % mod;

        return dp[length] = (takeZero + takeOne) % mod;
    }
}
