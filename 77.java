class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        List<Integer> path = new ArrayList<>();
        backtrack(n,k,list,ans, path,0);
        return ans;
    }

    public void backtrack(int n, int k, List<Integer> list, List<List<Integer>> ans, List<Integer> path, int index){
        if(path.size() == k){
            ans.add(new ArrayList(path));
            return;
        }
        if(index == n) return;

        path.add(list.get(index));
        backtrack(n,k,list,ans,path,index+1);
        path.remove(path.size()-1);

        backtrack(n,k,list,ans,path,index+1);
        
    }
}
