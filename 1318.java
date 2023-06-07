import java.lang.Math.*;
class Solution {
    public int minFlips(int a, int b, int c) {
        int ans = 0;
        int lena = (int)(Math.log(a) / Math.log(2));
        int lenb = (int)(Math.log(b) / Math.log(2));
        int lenc = (int)(Math.log(c) / Math.log(2));
        int n = Math.max(Math.max(lena,lenb),lenc);
        System.out.println(n);
        for(int i = 0; i < n+1;i++){
            int C = c&1;
            int A = a&1;
            int B = b&1;
            if(C == 1){
                if(A == 0 && B ==0){
                    ans++;
                }
            }
            else{
                if(A == 1 && B == 1){
                    ans+=2;
                }
                else if(A == 1 || B == 1){
                    ans++;
                }
            }
            c = c>>1;
            b = b>>1;
            a = a>>1;
        }
        return ans;
    }
}
