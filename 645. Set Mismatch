class Solution {
    public int[] findErrorNums(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // List<Integer> ans = new ArrayList<>();
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index+1){
                return new int[] {arr[index], index+1};
            }
        }
        // Object[] ans1 = ans.toArray();

        // Integer[] integerArray = Arrays.copyOf(ans1 ,ans1.length, Integer[].class);
        return new int[] {-1, -1};
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
