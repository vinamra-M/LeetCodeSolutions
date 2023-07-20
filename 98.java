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
    public boolean isValidBST(TreeNode root) {
        return answer(root, null, null);
    }
    public boolean answer(TreeNode root, Integer max, Integer min){
        if(root == null) return true;

        if((max != null && root.val >= max) || (min != null && root.val <= min))
            return false;

        return answer(root.left, root.val, min) && answer(root.right, max, root.val); 
        
    }
}
