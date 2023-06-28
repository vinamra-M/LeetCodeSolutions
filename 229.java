import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length/3;
        // n = n/3;
        if(n == 0){
            for(int i = 0; i < nums.length; i++) {
                if(!ans.contains(nums[i]))
                    ans.add(nums[i]);
            }
            return ans;
        }
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                int count = hash.get(nums[i]);
                count++;
                hash.put(nums[i], count);
            }
            else hash.put(nums[i],1);
        }

        hash.forEach((key, value) -> {
            if(value > n) ans.add(key);
        });
        return ans;
    }
}
