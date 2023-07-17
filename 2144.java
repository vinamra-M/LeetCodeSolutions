import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        reverse(cost);
        int sum = 0;
        for(int i = 0; i < cost.length; i++){
            sum+=cost[i];
        }
        for(int i = cost.length-1; i >= 0; i--){
            if(i%3 == 2) sum-=cost[i];
        }
        return sum;
    }

     public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}
