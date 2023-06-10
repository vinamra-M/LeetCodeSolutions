import java.lang.Math.*;
import java.util.Hashtable;
import java.util.Map;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Hashtable<Integer, Integer> has = new Hashtable<>();
        for(int num: nums){
            if(has.containsKey(num)){
                int a = has.get(num);
                a++;
                if(a > n/2){
                    return num;
                }
                has.put(num,a);
            }
            else{
                has.put(num,1);
            }
        }
        return nums[0];
    }
}
