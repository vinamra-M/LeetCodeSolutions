class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        if(p.length() > s.length()) return new ArrayList<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        int n = p.length();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < s.length()-p.length()+1; i++){
            if(map.equals(map2)) ans.add(i);
            if(i < s.length()-n){
                char ch = s.charAt(i+n);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                if(map2.get(s.charAt(i)) == 1)map2.remove(s.charAt(i));
                else map2.put(s.charAt(i),map2.get(s.charAt(i))-1);
            }
        }
        return ans;

        
    }
}
