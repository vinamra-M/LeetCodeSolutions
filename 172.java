class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int i = 1;
        while(i > 0){
            int den = (int)Math.pow(5,i);
            int curr = n/den;
            if(curr <= 0) break;
            ans += curr;
            i++;
        }
        return ans;
    }
}
