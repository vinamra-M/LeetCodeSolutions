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
    public int maxPathSum(TreeNode root) {
        int[] diameter = new int[1];
        diameter[0] = Integer.MIN_VALUE;
        solve(root,diameter);
        return diameter[0];
    }
    public int solve(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int l = solve(root.left,diameter);
        int r = solve(root.right,diameter);
        int temp = Math.max(Math.max(l,r)+root.val,root.val);
        int ans = Math.max(temp,l+r+root.val);
        diameter[0] = Math.max(diameter[0],ans);

        return temp;
    }
}
