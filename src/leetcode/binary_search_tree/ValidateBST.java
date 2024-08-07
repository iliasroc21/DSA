package leetcode.binary_search_tree;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTNode(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
    private boolean isValidBSTNode(TreeNode currentNode , long min , long max){
        if(currentNode == null)return true;
        if(currentNode.val >=max || currentNode.val <= min)return false;
        return isValidBSTNode(currentNode.left , min , currentNode.val ) && isValidBSTNode(currentNode.right , currentNode.val , max);
    }
}
