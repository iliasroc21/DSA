package leetcode.binary_search_tree;

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return helper(root , 0 ) ;
    }
    private int helper(TreeNode root , int sum ){
        if(root==null)return 0 ;
        if(root.right==null && root.left==null)return sum*10+root.val ;
        return helper(root.left , sum*10+root.val )  + helper(root.right ,sum*10+root.val);
    }
}
