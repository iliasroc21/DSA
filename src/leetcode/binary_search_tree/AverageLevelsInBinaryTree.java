package leetcode.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            long sum = 0 ;
            for(int i = 0 ; i < n ; i++){
                TreeNode current = queue.remove();
                sum+=current.val;
                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
            }
            result.add((double) sum/n);
        }
        return result;
    }
}
