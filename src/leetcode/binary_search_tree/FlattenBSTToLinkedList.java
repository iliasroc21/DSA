package leetcode.binary_search_tree;

public class FlattenBSTToLinkedList {
    private TreeNode prev= null ;
    public void flatten(TreeNode root){
        if(root==null)return ;
        flatten(root.right);
        flatten(root.left);
        root.right =prev;
        root.left =null ;
        prev = root;
    }
}
