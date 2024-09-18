package leetcode.binary_search_tree;

public class ConstructBSTFromInOrderAndPreOrder {
    int p =0 ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null)return null ;
        return helper(preorder, inorder, 0 , inorder.length-1);
    }
    private TreeNode helper(int[] preorder, int[] inorder , int start , int end){
        if(start> end)return null ;
        int i = find(preorder[p] ,inorder, start, end);
        TreeNode root = new TreeNode(preorder[p]);
        p++;
        root.left= helper(preorder, inorder, start , i-1);
        root.right =helper(preorder, inorder ,i+1 , end );
        return root;
    }
    private int find(int val, int[] inorder,int start, int end){
        while(start < end && inorder[start] != val && inorder[end] != val) {
            start++;
            end--;
        }
        return inorder[start] == val ? start : end;
    }
}
