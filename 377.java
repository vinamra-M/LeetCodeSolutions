import java.util.Arrays;

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[][] memo = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return solve(nums, target, memo);
    }

    public int solve(int[] nums, int target, int[][] memo) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (memo[nums.length][target] != -1) return memo[nums.length][target];

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += solve(nums, target - nums[i], memo);
        }

        memo[nums.length][target] = count;
        return memo[nums.length][target];
    }
}
