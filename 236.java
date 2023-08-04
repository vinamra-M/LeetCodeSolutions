
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p.val,q.val);
    }
    public static TreeNode lca(TreeNode root,int n1,int n2){//O(n)
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();
        
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        for(TreeNode node: path1){
            System.out.print(node.val+" ");
        }
        System.out.println();
        for(TreeNode node: path2){
            System.out.print(node.val+" ");
        }
        int i=0;

        for(i=0;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        TreeNode lastComman=path1.get(i-1);
        return lastComman;
    }
    public static boolean getPath(TreeNode root,int n,ArrayList<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.val==n){
            return true;
        }
        boolean left=getPath(root.left, n, path);
        boolean right=getPath(root.right, n, path);
        if(left||right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
