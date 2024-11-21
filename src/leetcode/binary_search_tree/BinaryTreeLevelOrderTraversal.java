package leetcode.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> group = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                TreeNode current = queue.remove();
                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
                group.add(current.val);
            }
            result.add(group);
        }
        return result;


    }
}
