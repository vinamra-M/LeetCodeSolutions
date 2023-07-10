import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            int a  = nums1[i];
            if(!hash.containsKey(a)){
                hash.put(a,1);
            }
            else{
                int c = hash.get(a);
                hash.put(a,++c);
            }
        }
        System.out.println(hash);
        for(int i = 0; i < nums2.length; i++){
            int b = nums2[i];
            if(hash.containsKey(b)){
                int d = hash.get(b);
                if(d == 0) 
                    continue;
                else{
                    ans.add(b);
                    hash.put(b,--d);
                }
            }
        }
        System.out.println(hash);
        int[] ret = new int[ans.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = ans.get(i).intValue();
        }
        return ret;
        
    }
}
