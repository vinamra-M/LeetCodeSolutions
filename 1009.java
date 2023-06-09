import java.lang.Math.*;
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int result = 0;
        int fac = 1;
        int len = (int)(Math.log(n) / Math.log(2));
        len++;
        for(int i = 0; i < len; i++){
            int bit = n&1;
            int mul = (bit == 1 ? 0:1);
            result+= fac*mul;
            n>>=1;
            fac*=2;
        }
        return result;
        
    }
}
