class Solution {
    public int[] evenOddBit(int n) {
        int[] result = new int[2];

        for(int i=0; i < 10; i++){
            int index = i%2;
            int bit = n&1;
            if(bit == 1){
                result[index]++;
            }
            n>>=1;

        }
        return result;
        
    }
}
