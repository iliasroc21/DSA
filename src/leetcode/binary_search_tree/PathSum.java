package leetcode.binary_search_tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root , int targetSum){
        if(root==null)return false;
        TreeNode left = root.left;
        TreeNode right = root.right ;
        if(left==null && right == null)return targetSum==root.val;
        return hasPathSum(left, targetSum-root.val) ||
                hasPathSum(right , targetSum-root.val);
    }
}
