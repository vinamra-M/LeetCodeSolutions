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
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return Math.max(solve(root,true,0),solve(root.left,false,0));
    }

    public int solve(TreeNode root, boolean direction, int count){
        if(root == null) return count-1;
        if(direction == true) return Math.max(solve(root.left,false,count+1),solve(root.right,true,1));
        else return Math.max(solve(root.right,true,count+1),solve(root.left,false,1));
    }
}
