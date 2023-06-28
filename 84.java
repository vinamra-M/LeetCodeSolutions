class Solution {
    public int largestRectangleArea(int[] histo) {
        Stack<Integer> stack = new Stack<>();
        int n = histo.length;
        int max = 0;

        for(int i = 0; i <= n; i++){
            while(!stack.isEmpty() && (i == n || histo[i] <= histo[stack.peek()])){
                int height = histo[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                max = Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}
