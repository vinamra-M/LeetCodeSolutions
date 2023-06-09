class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        if(bits.length == 1) return true;
        while(i < bits.length){
            if(bits[i] == 1){
                i+=2;
            }
            else if(bits[i] == 0){
                i+=1;
            }
            if(i == bits.length-1) return true;
        }
        return false;
    }
}
