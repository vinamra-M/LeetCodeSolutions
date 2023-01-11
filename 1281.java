class Solution {
    public int subtractProductAndSum(int n) {
        int a = product(n);
        int b = sum(n);
        int ans = a-b;
        return ans;
        
    }
    int product(int n){
        int pro = 1;
        int k = 0;
        while(n>0){
            k = n%10;
            n = n/10;
            pro*=k;
        }
        return pro;
    }

    int sum(int n){
        int s = 0;
        int k = 0;
        while(n>0){
            k = n%10;
            n = n/10;
            s += k;
        }
        return s;

    }
}
