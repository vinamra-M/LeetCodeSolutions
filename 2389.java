class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);
        for(int i = 0; i < m; i++){
            int e = n-1;
            int req = queries[i];
            int total = sum(nums);
            while(total > req){
                    total-=nums[e];
                    e-=1;
            }
            ans[i] = e+1;
        }
        return ans;
        
    }
    public static int sum(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans+=arr[i];
        }
        return ans;
    }
}
