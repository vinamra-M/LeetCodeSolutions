class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int cite: citations){
            if(cite >= n) return n;
            n--;
        }
        return n;
    }
}
