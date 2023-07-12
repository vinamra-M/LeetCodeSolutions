class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int i = 0;
        int j = (int)1000000000;
        Arrays.sort(houses);
        Arrays.sort(heaters);

        while(i <= j){
            int mid = i + (j-i)/2;

            if(isPossible(houses,heaters,mid)){
                j = mid-1;
            }
            else i = mid+1;
        }
        return i;
    }

    private boolean isPossible(int[] houses, int[] heaters, int r){
        int i = 0;
        int j = 0;
        while(i < houses.length){
            if(houses[i] < heaters[j] - r) return false;
            if(houses[i] > heaters[j] + r){
                if(++j == heaters.length) return false;
                i--;
            }
            i++;
        }
        return true;
    }
}
