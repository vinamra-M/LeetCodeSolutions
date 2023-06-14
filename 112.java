/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    public boolean dfs(TreeNode root, int target, int ans){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            ans+=root.val;
            if(ans == target) return true;
        }
        return dfs(root.left,target,ans+root.val) || dfs(root.right,target,ans+root.val);
    }
}
