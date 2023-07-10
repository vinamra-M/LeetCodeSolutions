class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            if(binarySearch(arr1[i],arr2,d)){
                count++;
            }
        }
        return count;
    }
    public static boolean binarySearch(int num, int[] nums, int d){
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(Math.abs(num-nums[mid]) <= d){
                return false;
            }
            else if(num > nums[mid]){
                s = mid + 1;
            }
            else{
                e = mid-1;
            }
        }
        return true;
    }
}
