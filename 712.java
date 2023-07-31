class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        return solve(s1, s2, 0, 0, dp);
    }

    public int solve(String s1, String s2, int m, int n, int[][] dp) {
        if (m == s1.length()) {
            int sum = 0;
            for (int i = n; i < s2.length(); i++)
                sum += s2.charAt(i);
            return sum;
        }

        if (n == s2.length()) {
            int sum = 0;
            for (int i = m; i < s1.length(); i++)
                sum += s1.charAt(i);
            return sum;
        }

        if (dp[m][n] != 0) return dp[m][n];

        if (s1.charAt(m) == s2.charAt(n))
            return dp[m][n] = solve(s1, s2, m + 1, n + 1, dp);

        int a = s1.charAt(m) + solve(s1, s2, m + 1, n, dp);
        int b = s2.charAt(n) + solve(s1, s2, m, n + 1, dp);
        int c = s1.charAt(m) + s2.charAt(n) + solve(s1, s2, m + 1, n + 1, dp);

        return dp[m][n] = Math.min(Math.min(a, b), c);
    }
}
