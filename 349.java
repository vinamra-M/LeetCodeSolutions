import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            int a  = nums1[i];
            if(!hash.containsKey(a)){
                hash.put(a,1);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            int b = nums2[i];
            if(hash.containsKey(b)){
                ans.add(b);
                hash.remove(b);
            }
        }
        int[] ret = new int[ans.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = ans.get(i).intValue();
        }
        return ret;
        
    }
}
