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
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int curr){
        if(root == null) return 0;

        int total = (curr<<1)+root.val;
        int left = sum(root.left,total);
        int right = sum(root.right, total);
        if(left == 0 && right == 0) return total;
        else return left+right;
    }
}
