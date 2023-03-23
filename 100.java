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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         List<Integer> lis1=new ArrayList<Integer>();
         List<Integer> lis2=new ArrayList<Integer>();
         postOrder(p,lis1);
         postOrder(q,lis2);
         if(lis1.equals(lis2))return true;
         else return false; 
    }
    public void postOrder(TreeNode p,List<Integer> list){
        if(p==null) return;
        postOrder(p.left,list);
        list.add(p.val);
        postOrder(p.right,list);
        if(p.left ==null) list.add(null);
        if(p.right==null) list.add(null);
        
    }
}
