class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int sMax = Integer.MIN_VALUE;

        for(int i = n-1; i >= 0; i--){
            if(nums[i] < sMax) return true;

            while(!stack.isEmpty() && stack.peek() < nums[i])
                sMax = Math.max(stack.pop(), sMax);

            stack.push(nums[i]);
        }
        return false;
    }
}
