class Solution {
    Map<String, Map<String, Double>> map = new HashMap<>();
    Set<String> visited = new HashSet<>();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = queries.size();
        double[] ans = new double[n];

        for(int i = 0; i < equations.size(); i++){
            map.putIfAbsent(equations.get(i).get(0),new HashMap<>());
            map.putIfAbsent(equations.get(i).get(1),new HashMap<>());
            map.get(equations.get(i).get(0)).put(equations.get(i).get(1), values[i]);
            map.get(equations.get(i).get(1)).put(equations.get(i).get(0),1/values[i]);
        }

        for(int i = 0; i < n; i++){
            visited.clear();
            ans[i] = dfs(queries.get(i).get(0),queries.get(i).get(1),1.0);
        }
        return ans;
    }

    public double dfs(String start, String end, double result){
        if(!map.containsKey(start)) return -1.0;
        if(start.equals(end)) return result;
        visited.add(start);

        for(var div: map.get(start).entrySet()){
            if(!visited.contains(div.getKey())){
                double ans = dfs(div.getKey(),end,div.getValue());

                if(ans!=-1.0) return result*ans;
            }
        }
        return -1.0;
    }
}
