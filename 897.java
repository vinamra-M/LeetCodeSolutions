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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arr = inorder(root, new ArrayList<Integer>());
        TreeNode ans = new TreeNode(0);
        TreeNode curr = ans;
        for(int i : arr){
            curr.right = new TreeNode(i);
            curr = curr.right;
        }
        return ans.right;
    }

    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }
}
