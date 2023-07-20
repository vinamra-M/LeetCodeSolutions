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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        pre(root,0,al);
        return al;
        
    }

        public static void pre(TreeNode root, int l, List<List<Integer>> al){
        if(root == null)
            return;
        if(al.size() == l)
        {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            al.add(li);
        }
        else{
            if(l%2 == 0) al.get(l).add(root.val);
            else al.get(l).add(0,root.val);
        }
        pre(root.left,l+1,al);
        pre(root.right,l+1,al);
    }
}
