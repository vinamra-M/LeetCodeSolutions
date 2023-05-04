class Solution {
    public int numberOfMatches(int n) {
        int m = 0;
        int ans = totalTeams(n , m);
        return ans;
    }
    public int totalTeams(int n, int m)
    {
        if(n == 1){
            return m;
        }
        if(n%2 == 0){
            m += n/2;
           return totalTeams(n/2, m); 
        }
        if(n % 2 == 1){
            m+= (n-1)/2;
           return totalTeams((n+1)/2,m);
        }
        return 0;
    }
}


// or maybe just return n-1
