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
    ArrayList<Integer> arr = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min = 100000;

        for(int i = 1; i < arr.size(); i++){
            int diff = arr.get(i) - arr.get(i-1);
            min = Math.min(diff,min);
        }
        return min;
    }

    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}
