class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=arr[i];
        }
        if(sum%3 != 0) return false;

        int ind1 = -1;
        int ind2 = -1;
        int sum1 = 0;
        for(int i = 0; i < n; i++){
            sum1+=arr[i];
            if(sum1 == sum/3){
                ind1 = i;
                break;
            }
        }
        int sum2 = 0;
        for(int i = ind1+1; i < n-1; i++){
            sum2+=arr[i];
            if(sum2 == sum/3){
                ind2 = i;
                break;
            }
        }
        if(ind1 == -1 || ind2 == -1) return false;
        if(sum1 == sum/3 && sum2 == sum/3){
            return true;
        }
        return false;
        
    }
}
