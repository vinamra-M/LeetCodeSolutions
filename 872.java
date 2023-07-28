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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        traversal(root1,arr1);
        traversal(root2,arr2);
        if(arr1.equals(arr2)) return true;
        return false;
    }

    public void traversal(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null)
            arr.add(root.val);
        traversal(root.left,arr);
        traversal(root.right,arr);
        return;
    }

}
