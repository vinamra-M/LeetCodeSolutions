class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*') st.push(s.charAt(i));
            else st.pop();
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        String rev = sb.toString();
        String ans = "";
        char ch;
        for(int i = 0; i < rev.length(); i++){
            ch = rev.charAt(i);
            ans = ch+ans;
        }
        return ans;
        
    }
}
