class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,ans,curr,0);
    }

    public void solve(int[] nums, List<List<Integer>> ans, List<Integer> curr, int index){
        if(index > nums.length) return;
        if(index == nums.length){
            ans.add(new ArrayList<>() curr);
        }  
    }
}
