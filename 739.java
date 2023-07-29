class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for(int i = 1; i < temp.length; i++){
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                int c = s.pop();
                ans[c] = i - c;
            }
            s.add(i);
        }
        return ans;
    }
}
