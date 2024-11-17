package leetcode.binary_search_tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null)return result ;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int  i = 0 ; i < n ; i++){
                TreeNode current = queue.remove();
                if(i==n-1)result.add(current.val);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
        }
        return result ;
    }
}
