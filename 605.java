class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int max = 0;
        if(flowerbed.length==1){
            if(flowerbed[i]==0){
                max++;
                i++;
            }
        }
         while(i<flowerbed.length){
            
            if(flowerbed[i]==1){
                i++;
            }else{
                if(i==0 && flowerbed[i+1]==0){
                    max++;
                    flowerbed[i]=1;
                    i++;
                }
                if(i>0 && i<flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    max++;
                    flowerbed[i]=1;
                    i++;
                }
                else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    max++;
                    i++;
                }
                 if (max >= n) {
                     return true;
                }
            }
            i++;
        }
        return max >= n;
    }
}
