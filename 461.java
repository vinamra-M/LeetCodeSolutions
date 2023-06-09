
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        // int lena = 
        for(int i = 0; i < 32; i++){
            int bit1 = x&1;
            int bit2 = y&1;
            if(bit1 != bit2) result++;
            x>>=1;
            y>>=1;
        }
        return result;
    }
}
