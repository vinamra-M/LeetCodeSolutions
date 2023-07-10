class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for(int candies: aliceSizes) sumA+=candies;
        for(int candies: bobSizes) sumB+=candies;

        Arrays.sort(bobSizes);

        int m = aliceSizes.length, n = bobSizes.length;
        for(int i = 0; i < m; i++){
            int target = (sumB + 2 * aliceSizes[i] - sumA)/2;
            if(binarySearch(bobSizes, target))
                return new int[] { aliceSizes[i], target};
        }
        return new int[0];       
    }
     private boolean binarySearch(int[] arr, int target) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (target < arr[m])
        r = m - 1;
      else if (target > arr[m])
        l = m + 1;
      else
        return true;
    }
    return false;
  }
}
