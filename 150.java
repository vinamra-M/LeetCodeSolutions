class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String ch: tokens)
        {
            if(Op(ch)){
                String a = stack.pop();
                String b = stack.pop();
                String num = operate(a,b,ch);
                stack.push(num);
            } else stack.push(ch);
        }
        return Integer.valueOf(stack.pop());
    }

    public boolean Op(String ch){
        if(ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*")) return true;
        else return false;
    }

    public String operate(String a, String b, String ch){
        int a1 = Integer.valueOf(a);
        int a2 = Integer.valueOf(b);
        if(ch.equals("+")) return Integer.toString(a1+a2);
        if(ch.equals("*")) return Integer.toString(a1*a2);
        if(ch.equals("/")) return Integer.toString(a2/a1);
        if(ch.equals("-")) return Integer.toString(a2-a1);
        else return "1";
    }
}
