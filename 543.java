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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        solve(root,diameter);
        return diameter[0]-1;
    }

    public int solve(TreeNode root,int[] diameter){
        if(root == null) return 0;

        int l = solve(root.left,diameter);
        int r = solve(root.right,diameter);
        int temp = Math.max(l,r)+1;
        int ans = Math.max(temp,1+l+r);
        diameter[0]= Math.max(diameter[0],ans);

        return temp;

    } 
}
