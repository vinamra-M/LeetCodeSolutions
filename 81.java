class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                pivot = i;
                break;
            }
        }
        System.out.println(pivot);

        if(pivot == -1){
            int a = binarySearch(nums, target, 0, nums.length-1);
            if(a >= 0) return true;
        }

        int b = binarySearch(nums, target, 0, pivot);
        if(b >= 0) return true;

        b = binarySearch(nums, target, pivot+1, nums.length-1);
        if(b>=0) return true;

        return false;
        
    }

        int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}

//findPivot doesnt work here due to repetition of elements.
