package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestNumberInArray {
    public static int findKthSmallest(int[] nums, int k){
        PriorityQueue<Integer > heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums){
            heap.add(num);
            if(heap.size() > k ){
                heap.remove();
            }
        }
        return heap.peek() ;
    }
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer > heap = new PriorityQueue<>();
        for(int num : nums){
            heap.add(num);
            if(heap.size() > k ){
                heap.remove();
            }
        }
        return heap.peek() ;
    }
}
