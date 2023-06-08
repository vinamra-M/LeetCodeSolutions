class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 1) return true;
        int bit = n&1;
        n>>=1;
        while(n > 0){
            int temp = n&1;
            if(bit != temp){
                bit = temp;
            }
            else{
                return false;
            }
            n>>=1;
        }
        return true;
    }
}
