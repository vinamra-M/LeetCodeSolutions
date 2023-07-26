class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        int min = 1;
        int max = (int)1e7;
        int ans = -1;

        while(min<=max){
            int mid = min + (max-min)/2;
            if(works(dist,hour,mid,n)){
                ans = mid;
                max = mid-1;
            }
            else
                min = mid+1;
        }
        return ans;
    }

    public boolean works(int[] dist, double hour, int speed, int length){
        double ans = 0;
        for(int i = 0; i < length; i++){
            double time = dist[i]*1.0/speed;
            if(i!=length-1)ans = ans + Math.ceil(time);
            else ans+=time;

            if(ans > hour) return false;
        }
        return ans<=hour;
    }
}
