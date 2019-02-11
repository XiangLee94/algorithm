package twoplus;

public class Solution235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val <= root.val && q.val >= root.val)
            return root;
        else if(p.val >= root.val && q.val >= root.val)
            return lowestCommonAncestor(root.right,p,q);
        else if (p.val <= root.val && q.val <= root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else return null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
