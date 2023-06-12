class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        if(nums.length == 1){
            ans.add(""+nums[0]);
            return ans;
        }
        int start = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1] + 1){
                int end = nums[i-1];
                ans.add(end == start ? ""+start : String.format("%d->%d",start,end));
                start = nums[i];      
                }
                if(i == nums.length - 1){
                    int end = nums[i];
                    ans.add(end == start ? ""+start : String.format("%d->%d",start,end));
                }
            }
            return ans;        
        }
    }
