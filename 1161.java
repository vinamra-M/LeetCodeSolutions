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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);

        for(int level = 1; !que.isEmpty(); level++){
            int sum = 0;

            for(int i = que.size(); i > 0; i--){
                TreeNode node = que.poll();
                sum+=node.val;
                if(node.left!=null)que.offer(node.left);
                if(node.right!=null)que.offer(node.right);
            }
            if(sum > max){
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
}
