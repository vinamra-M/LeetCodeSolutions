class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        if(s1.length() > s2.length()) return false;
        int n = s1.length();
        for(int i = 0; i < n; i++){
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        int m = s2.length();
        for(int i = 0; i < m-n+1; i++){
            if(map1.equals(map2)) return true;
            else if(i < m-n){
                char ch = s2.charAt(i);
                char next = s2.charAt(i+n);
                if(map2.get(ch) == 1) map2.remove(ch);
                else map2.put(ch,map2.get(ch)-1);
                map2.put(next, map2.getOrDefault(next,0)+1);
            }
        }
        return false;
    }
}
