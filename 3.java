class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()) {

            char ch = s.charAt(end);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }
            if(map.size() == (end - start + 1)) {
                max = Math.max(max, (end - start + 1));
                end++;
            }
            else if(map.size() < (end - start + 1)) {
                while(map.size() < (end - start + 1)) {
                    
                    char chStart = s.charAt(start);
                    map.put(chStart, map.get(chStart) - 1);
                    if(map.get(chStart) == 0) {
                        map.remove(chStart);
                    }
                    start++;
                }
                end++;
            }
        }
        return max;
    }
}
