class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                int a  = map.get(c);
                a++;
                map.put(c,a);
            }
            else map.put(c,1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}
