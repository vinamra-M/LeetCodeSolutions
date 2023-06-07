class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++){
            int j = 0;
            int k = n-1;
            while(j <= k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            for(int l = 0; l < n; l++){
                image[i][l] = image[i][l]^1;
            }
        }
        return image;
    }
}
