class Solution {
    public int maximum69Number (int num) {
        for(int i = 10000; i > 0; i = i/10){
            if((num/i)%10 == 6){
                num = num - i*6;
                num = num + i*9;
                return num;
            }
        }
        return num;
    }
}
