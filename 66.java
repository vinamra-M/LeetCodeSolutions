class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        int len = digits.length;
        for(int i = len-1; i>=0; i-- ){
            if(digits[i] == 9){
                count++;
            }
            else{
                break;
            }
        }
        if(count == len){
            int[] ans = new int[len+1];
            ans[0] = 1;
            for(int i=1; i< len+1;i++){
                ans[i] = 0;
            }
            return ans;
        }
        else{
            digits[len-count-1]+=1;
            for(int i = len-count; i < len;i++){
                digits[i] = 0;
            }
            return digits;

        }
        
    }
}
