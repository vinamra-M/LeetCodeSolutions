import java.util.Hashtable;
import java.util.Map;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character, Integer> has = new Hashtable<>();
                Hashtable<Character, Integer> has2 = new Hashtable<>();

        for(int i = 0; i < magazine.length(); i++){
            if(has.containsKey(magazine.charAt(i))){
                has.put(magazine.charAt(i), has.get(magazine.charAt(i))+1);
            }
            else{
                has.put(magazine.charAt(i),1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(has.containsKey(ransomNote.charAt(i)) && has.get(ransomNote.charAt(i)) >0){
                has.put(ransomNote.charAt(i),has.get(ransomNote.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    
        
    }
}
