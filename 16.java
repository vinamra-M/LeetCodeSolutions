class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        for(int i = 0; i < nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int Tsum = nums[i]+nums[j]+nums[k];

                if(Math.abs(target-sum) > Math.abs(target-Tsum)) sum = Tsum;

                if(Tsum < target)j++;
                else k--;
            }
        }
        return sum;
    }
}
