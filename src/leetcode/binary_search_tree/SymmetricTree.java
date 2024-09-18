package leetcode.binary_search_tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isIdentical(root.left, root.right);
    }
    private boolean isIdentical(TreeNode left, TreeNode right){
        if(left==null && right==null)return true;
        if(left==null || right==null)return false ;
        return left.val ==right.val && isIdentical(left.left , right.right) && isIdentical(left.right , right.left);
    }
}
