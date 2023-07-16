class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1],b[1]));
        int ans = 0;
        int n = boxTypes.length;
        int i = n-1;
        while(truckSize > 0 && i >= 0){
            int box = Math.min(truckSize,boxTypes[i][0]);
            ans+=box*boxTypes[i][1];
            i--;
            truckSize -= box;
        }
        return ans;
        
    }
}
