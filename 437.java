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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        return (int)pathSum(root.left,targetSum) + (int)pathSum(root.right,targetSum) + (int)solve(root,0,(long)targetSum) ;
    }

    public long solve(TreeNode root, long current,long target){
        if(root == null) return 0;
        current += (long)root.val;

        return (current == target ? 1 : 0) + solve(root.left,current,target) + solve(root.right,current,target);
    }
}
