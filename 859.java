class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        if(s.equals(goal)) {
            Set<Character> ans = new HashSet<>();
            for(char c: s.toCharArray()){
                ans.add(c);
            }
            return ans.size() < goal.length();
        }

        int i = 0;
        int j = n-1;
        while(i < j && s.charAt(i) == goal.charAt(i)) i++;
        while(j >=0 && s.charAt(j) == goal.charAt(j)) j--;

        if(i < j){
            char[] sArr = s.toCharArray();
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            s = new String(sArr);
        }
        return(s.equals(goal));
        
    }
}
