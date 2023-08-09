class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), s, 0);
        return ans;
    }

    public void solve(List<List<String>> ans, List<String> list, String s, int index){
        if(index >= s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(correct(s,index,i)){
                list.add(s.substring(index,i+1));
                solve(ans,list,s,i+1);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean correct(String st, int s, int e){
        while(s < e){
            if(st.charAt(s) != st.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
