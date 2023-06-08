import java.lang.Math.*;
class Solution {
    int ans = 0;
    public int minBitFlips(int start, int goal) {
        int Ls = (int)(Math.log(start) / Math.log(2));
        int Lg = (int)(Math.log(goal) / Math.log(2));
        int n = Math.max(Ls,Lg);
        for(int i = 0; i <= n; i++ ){
            int a = start&1;
            int b = goal&1;
            if(a != b){
                ans++;
            }
            start>>=1;
            goal>>=1;

        }
        return ans;
       
    }

}
