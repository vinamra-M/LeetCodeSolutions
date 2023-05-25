class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        HashSet<Character> set = new HashSet();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                ans+=2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            ans++;
        }
        return ans;
    }
}
