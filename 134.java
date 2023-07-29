class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a = 0, b = 0, ans = 0, total = 0;
        for(int i = 0; i < gas.length; i++){
            a += gas[i];
            b += cost[i];
        }
        if(a<b) return -1;

        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                ans = i+1;
            }
        }
        return ans;
    }
}
