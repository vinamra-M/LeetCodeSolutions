class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;
        int leftMax = height[i];
        int rightMax = height[j];
        int res = 0;
        while(i < j){
            if(height[i] <= height[j]){
                if(height[i] < leftMax){
                    res+=leftMax - height[i];
                } else leftMax = height[i];
                i++;
            } else {
                if(height[j] < rightMax){
                    res += rightMax - height[j];
                } else rightMax = height[j];
                j--;
            }
        }
        return res;
    }
}
