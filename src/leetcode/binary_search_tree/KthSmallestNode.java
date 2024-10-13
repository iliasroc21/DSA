package leetcode.binary_search_tree;

import java.util.PriorityQueue;
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
    //second solution for me is to use Heap using priorityQueue
    private PriorityQueue<Integer> heap  = new PriorityQueue<>();
    public int kthSmallest2(TreeNode root, int k)
    {

        fillUpPriorityQueue(root);
        while(--k>0 && heap.size()>k){
            heap.poll();
        }
        return heap.peek();


    }
    private void fillUpPriorityQueue(TreeNode root){
        if(root==null)return ;
        heap.offer(root.val);
        fillUpPriorityQueue(root.left);
        fillUpPriorityQueue(root.right);

    }
}
