class Solution {
    public int hIndex(int[] citations) {
        int index = citations.length - 1;
        int len = citations.length;
        int number;
        int count = 0;
        for(int i = index; i >= 0; i--){
            number = len-i;
            if(citations[i] >= number) count++;
            else break;
        }
        return count;
    }
}
