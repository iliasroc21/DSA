package leetcode.binary_search_tree;

public class ConstructBSTFromInOrderAndPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder){
        if(inorder==null || postorder==null)return null ;
        return helper(inorder ,0 , inorder.length-1, postorder ,0 , postorder.length-1);
    }
    private TreeNode helper(int[]inorder, int inS , int inE , int[]postorder , int postS , int postE){
        if(inS > inE || postS > postE)return null;
        int value = postorder[postE];
        TreeNode root = new TreeNode(value);
        int i = find(value , inorder,inS , inE);
        root.right= helper(inorder, i+1 , inE , postorder , postS+i-inS , postE-1);
        root.left= helper(inorder,inS , i-1 ,postorder , postS ,postS+i-inS-1 );
        return root;
    }
    private int find(int value ,int[] inorder , int start , int end){
        while(start < end && inorder[start]!=value && inorder[end]!=value){
            start++;
            end--;
        }
        return inorder[start]==value ? start :end;
    }
}
