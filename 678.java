class Solution {
    public boolean checkValidString(String s) {
        // int starCount = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stars = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            else if(s.charAt(i) == '*')stars.push(i);
            else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()) stack.pop();
                else if(stars.isEmpty()) return false;
                else stars.pop();
            }
        }
        while(!stack.isEmpty() && !stars.isEmpty() && stack.peek() < stars.peek()){
            stars.pop();
            stack.pop();
        }
        return stack.isEmpty();
    }
}
