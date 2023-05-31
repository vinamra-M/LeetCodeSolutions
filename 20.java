class Solution {
    public boolean isValid(String s) {
        char[] ch = new char[s.length()];
         for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < ch.length){
            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{'){
                st.push(ch[i]);
            }
            else
            {
                if(st.empty()){
                    return false;
                }
                if (ch[i] == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch[i] == '}' && st.peek() == '{') {
                    st.pop();
                } else if (ch[i] == ']' && st.peek() == '[') {
                    st.pop();
        }        
        else{
            return false;
        }
    }
    i++;
}
return st.empty();
    }
}
