class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] allDays = new int[365];
        int[] dp = new int[365];
        for(int i: days){
            allDays[i-1] = 1;
        }

        return solve(allDays, costs, 0, dp);
    }

    public int solve(int[] allDays, int[] costs, int index, int[] dp){
        if(index >= 365) return 0;
        while( index < 365 && allDays[index] == 0){
            if(index >= 365) return 0;
            index++;
        }
        if(index >= 365) return 0;
        if(dp[index] != 0) return dp[index];

        int a = costs[0] + solve(allDays,costs,index+1,dp);
        int b = costs[1] + solve(allDays,costs,index+7,dp);
        int c = costs[2] + solve(allDays,costs,index+30,dp);

        return dp[index]= Math.min(a, Math.min(b,c));
    }
}
