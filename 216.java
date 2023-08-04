class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<Integer>(),k,1,n);
        return ans;
    }

    public void solve(List<List<Integer>> ans, List<Integer> list, int k, int start, int n){
        if(list.size() == k && n == 0){
            List<Integer> li = new ArrayList<Integer>(list);
            ans.add(li);
            return;
        }
        for(int i = start; i <= 9; i++){
            list.add(i);
            solve(ans,list,k,i+1,n-i);
            list.remove(list.size()-1);
        }
    }
}
