class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        reset(st, nums2);
        int[] answer = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            int entry = -1;
            while(num != st.peek()){
                if(st.peek() > num){
                    entry = st.peek();
                }
                st.pop();
            }
            answer[i] = entry;
            reset(st, nums2);
        }
        return answer;
        
    }

    public void reset(Stack<Integer> st, int[] nums2){
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i = 0; i < nums2.length; i++){
            st.push(nums2[i]);
        }
    }
}
