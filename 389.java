import java.util.Hashtable;
import java.util.Map;
class Solution {
    public char findTheDifference(String t, String s) {
        Hashtable<Character, Integer> map = new Hashtable<>();

        for(int i = 0; i< t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            }
            else{
                map.put(t.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 0){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            }
            else{
                return s.charAt(i);
            }
        }
        if(s.isEmpty()){
            return t.charAt(0);
        }
        return 's';
    }
}
