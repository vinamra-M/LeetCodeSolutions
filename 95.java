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
    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
    }
    public List<TreeNode> solve(int s, int e){
        if(s > e){
            List<TreeNode> a = new ArrayList<>();
            a.add(null);
            return a;
        }
        List<TreeNode> list = new ArrayList<>();
        for(int i = s; i <= e; i++){
            List<TreeNode> left = solve(s,i-1);
            List<TreeNode> right = solve(i+1,e);
            for(TreeNode l: left)
                for(TreeNode r: right)
                    list.add(new TreeNode(i,l,r));
        }
        return list;
    }
}
