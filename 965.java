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
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        return answer(root, value);
    }

    public boolean answer(TreeNode root, int value){
        if(root == null) return true;
        if(value != root.val)
            return false;
        if(root.left == null && root.right == null) return true;

        return answer(root.left, value) && answer(root.right, value) ;
        
    }
}
