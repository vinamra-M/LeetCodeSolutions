class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int j = i+1;
            int k = n-1;
            int target = 0-nums[i];
            while(j < k){
                if(nums[j]+nums[k] == target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);

                    while(j < k && nums[j+1] == nums[j]) j++;
                    while(j <k && nums[k-1] == nums[k]) k--;
                    j++;
                    k--;
                } else if(nums[j] + nums[k] < target) j++;
                else k--;

            }
            while(i+1 < n && nums[i+1] == nums[i])i++;
        }
        return ans;
    }
}
