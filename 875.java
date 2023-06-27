class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = 1000000000;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(finish(piles,h,mid)) end = mid-1;
            else start = mid+1;
        }
        return start;
    }

    public boolean finish(int[] piles, int h, int k){
        if(k == 0) return false;
        int sum = 0;
        for(int pile: piles){
            sum+=pile/k;
            if(pile%k != 0) sum++;
            if(sum > h) return false;
        }
        return true;
    }
}
