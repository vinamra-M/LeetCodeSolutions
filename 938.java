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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return answer(root, low, high);
    }

    public int answer(TreeNode root, int low, int high){
        if(root == null) return 0;
        int result = 0;
        if(root.val <= high && root.val >= low)
            result+=root.val;
        
        if(root.val > low) result+=answer(root.left, low, high);
        if(root.val < high) result+=answer(root.right, low, high);
        return result;
    }
}
