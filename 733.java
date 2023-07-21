class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void fill(int[][] img, int i, int j, int col, int newcol){
        if(i < 0 || j < 0 || i >= img.length || j >= img[0].length || img[i][j] != col) return;
        img[i][j] = newcol;
        fill(img,i-1,j,col,newcol);
        fill(img,i+1,j,col,newcol);
        fill(img,i,j-1,col,newcol);
        fill(img,i,j+1,col,newcol);
    }
}
