class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num: nums){
            int digits = digits(num);
            if(digits%2 ==0)
                ans++;

        }
        return ans;
        
    }

    static int digits(int num){
        int count = 0;
    while (num != 0) {
      num /= 10;
      count++;
    }
    return count;
    }
}
