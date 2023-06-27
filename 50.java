class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            x = 1/x;
            n = -1*n;
        }
        return power(x, n);
    }

    public double power(double x, int n){
          if(n==0) 
            return 1;
        
        double temp = power(x,n/2);
        
        if(n%2==0){
            return (temp * temp);
        }
        else{
            return (x * temp * temp);
        }

    }
}
