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
    HashMap<TreeNode,Integer> dp = new HashMap<>();
    public int rob(TreeNode root) {
        return solve(root);
    }

    public int solve(TreeNode root){
        if(root == null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int take = 0;
        int notTake = solve(root.left) + solve(root.right);
        take = root.val;
        if (root.left != null)
            take += solve(root.left.left) + solve(root.left.right);
        if (root.right != null)
            take += solve(root.right.left) + solve(root.right.right);
        // else theft = true;
        int res= Math.max(take,notTake);
        dp.put(root,res);
        return res;
        
    }
}
