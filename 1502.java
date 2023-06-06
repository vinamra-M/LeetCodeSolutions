class Solution {
    public boolean checkStraightLine(int[][] co) {
        int num = co[1][1]-co[0][1];
        int den = co[1][0]- co[0][0];
        for(int i = 1; i < co.length - 1; i++ ){
            int num1 = co[i+1][1]-co[i][1];
            int den1 = co[i+1][0]- co[i][0];
            if(num*den1 != num1*den){
                return false;
            }
        }
        return true;
    }
}
