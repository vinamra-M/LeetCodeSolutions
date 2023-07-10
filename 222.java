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
    public int countNodes(TreeNode root) {
        int ans = 0;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int TreeLeft = countNodes(root.left);
        int TreeRight = countNodes(root.right);
        return TreeLeft + TreeRight + 1;
        
    }
}
