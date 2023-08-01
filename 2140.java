class Solution {
    int m;
    public long mostPoints(int[][] questions) {
        m = questions.length;
        long[] dp = new long[m];
        return solve(questions, 0, dp);
    }

    public long solve(int[][] questions, int index, long[] dp){
        if(index >= questions.length) return 0;

        if(dp[index] != 0) return dp[index];
        long take = questions[index][0] + solve(questions, index + questions[index][1]+1,dp);
        long notTake = solve(questions,index+1,dp);

        return dp[index] = Math.max(take,notTake);
    }
}
