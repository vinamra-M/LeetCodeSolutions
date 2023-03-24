class Solution {
    public boolean isEquivalent(TreeNode left, TreeNode right) {
        if (left==null || right==null) return left == right;
        else return left.val == right.val && isEquivalent(left.left, right.right) && isEquivalent(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return isEquivalent(root.left, root.right);
    }
}
