class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] count = new int[2];
        for(int chip: position){
            ++count[chip%2];
        }
        return Math.min(count[0],count[1]);
    }
}
