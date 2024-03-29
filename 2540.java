class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int in1 = 0, in2 = 0, n1 = nums1.length, n2 = nums2.length;

        while(in1 < n1 && in2 < n2){
            if(nums1[in1] == nums2[in2]) return nums1[in1];
            else if(nums1[in1]>nums2[in2]) in2++;
            else in1++;
        }
        return -1;
    }
}
