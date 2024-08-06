package leetcode.binary_search_tree;

public class SortedArrayToBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public TreeNode sortedArrayToBST(int[] nums) {
       return sortedArrayToBST(nums , 0 , nums.length -1);
    }
    private TreeNode sortedArrayToBST(int nums[] , int left , int right){
     if(left > right)return null ;
     int middle = (left + right)/2;
     TreeNode result = new TreeNode(nums[middle]);
     result.left = sortedArrayToBST(nums , left , middle-1);
     result.right = sortedArrayToBST(nums, middle+1 , right);
     return result;
    }

}
