package leetcode.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumElementInAStream {
    public static List<Integer> streamMax(int[] nums){
        PriorityQueue<Integer> heap  = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            heap.add(num);
            result.add(heap.peek());
        }
        return result ;
    }

}
