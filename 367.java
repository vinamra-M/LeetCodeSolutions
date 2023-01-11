class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int j = num;
        while(i <= j){
            float mid = i + (j-i)/2;
            if(mid == (float)num/mid){
                return true;
            }
            else if(mid > num/mid){
                j = (int)mid-1;
            }
            else{
                i = (int)mid+1;
            }
        }
        return false;
    }
}
