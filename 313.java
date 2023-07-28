class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long dp[]=new long[n];
        int pointers[]=new int[1000];
        dp[0]=1;

        for(int i=1;i<n;i++){
            long min=Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                min=Math.min(min,primes[j]*dp[pointers[primes[j]]]); 
           }
            dp[i]=min;
                for(int j=0;j<primes.length;j++){
                    if(min==primes[j]*dp[pointers[primes[j]]]){
                        pointers[primes[j]]++;
                }
            }
        }      
        return (int)dp[n-1];
    }
}
