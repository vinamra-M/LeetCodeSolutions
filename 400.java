class Solution {
    public int findNthDigit(int n) {
        int s = 1;
        int e = n;
        long ans = 0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(digits(mid) <= (long)n){
                ans = mid;
                s = mid+1;
            }
            else e = mid-1;
        }

        if(digits((int)ans) == (long) n) return (int) ans % 10;
        else{
            long diff = n - digits((int)ans);
            long length = Long.toString(ans+1).length() - diff;
            long x = (long)Math.pow(10,length);
            ans = (ans+1)/x;
            return (int)ans%10;
        }
        
    }

    long digits(int n){
        int i = Integer.toString(n).length() - 1;
        long extra = 0;
        while (i > 0){
            int num = (int)Math.pow(10,i) - 1;
            extra += n - num;
            i--;
        }
        return extra + n;
    }
}
