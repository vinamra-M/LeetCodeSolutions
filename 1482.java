class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;

        int min = 1;
        int max = 1;
        for(int bloom: bloomDay){
            min = Math.min(min, bloom);
            max = Math.max(max, bloom);
        }
        
        while(min < max){
            int mid = min + (max-min)/2;
            if(canMake(bloomDay, mid, m, k)) max = mid;
            else min = mid+1;
        }
        return min;
    }

    public boolean canMake(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        for(int i: bloomDay){
            if(i <= mid){
                count ++;
                if(count == k){
                    m--;
                    count = 0;
                    if(m == 0) return true;
                }
            }
            else count = 0;
        }
        return false;
    }
}
