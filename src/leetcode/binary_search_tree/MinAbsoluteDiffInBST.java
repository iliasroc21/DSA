package leetcode.binary_search_tree;

public class MinAbsoluteDiffInBST {
    int min = Integer.MAX_VALUE;
    Integer prev =null ;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min ;
    }
    private void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(prev!=null){
            int abs = Math.abs(root.val -prev);
            min = Math.min(min, abs);
        }
        prev=root.val ;
        inorder(root.right);
    }
}
