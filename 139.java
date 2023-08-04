class Solution {
    Map<String, Boolean> map;
    Set<String> dist;
    public boolean wordBreak(String s, List<String> wordDict) {
        dist = new HashSet<>(wordDict);
        map = new HashMap<>();
        return solve(s);
    }

    boolean solve(String s){
        if(s.length() == 0){
            map.put(s,true);
            return true;
        }

        if(map.containsKey(s)) return map.get(s);

        for(String w: dist){
            if(s.startsWith(w)){
                String sub = s.substring(w.length());
                if(solve(sub)){
                    map.put(sub,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
}
