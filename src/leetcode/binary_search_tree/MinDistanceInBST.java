package leetcode.binary_search_tree;

public class MinDistanceInBST {
    private int min= Integer.MAX_VALUE;
    private Integer prev =null;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min ;
    }
    private void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(prev!=null){
            min = Math.min(min , root.val-prev);
        }
        prev= root.val ;
        inorder(root.right);
    }
}
