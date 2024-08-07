package leetcode.binary_search_tree;

import java.util.Stack;

public class KthSmallestNode {
    public static Integer kthSmallest( TreeNode root, int k){
        Stack<TreeNode> stack =  new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node !=null){
            while(node!=null){
                stack.push(node);
                node = node.left;

            }
            node = stack.pop();
            k-=1;
            if(k==0)return node.val;
            node =node.right;
        }
        return -1;

    }
}
