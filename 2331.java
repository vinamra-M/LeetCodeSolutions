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
    public boolean evaluateTree(TreeNode root) {
        return eval(root) == 0 ? false : true;
    }
    public int eval(TreeNode root){
        if(root.val == 0 || root.val == 1)
            return root.val;

        int left = eval(root.left);
        int right = eval(root.right);

        return root.val == 2 ? left | right : left & right;
    }
}
