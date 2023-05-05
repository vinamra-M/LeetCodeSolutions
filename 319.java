class Solution {
    public int bulbSwitch(int n) {
        // int ans = 0;
        // for(int i = 1; i < n+1;i++){
        //     int f = countFactors(i);
        //     if(f % 2 != 0){
        //         ans++;
        //     }
        // }
        // return ans;  this is correct only TLE
         return (int) Math.sqrt(n);
         //This is because factors of a number come in pairs 
         //except for perfect square numbers
        
    }
    public int countFactors(int n) {
    int count = 0;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 1; i <= sqrt; i++) {
        if (n % i == 0) {
            count += 2; 
        }
    }
    if (sqrt * sqrt == n) {
        count--;
    }
    return count;
}
}
