package leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1 , int[] nums2 , int k ){
        List<List<Integer>> pairs = new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (arr1 ,arr2 )->nums1[arr1[0]]+nums2[arr1[1]]-nums1[arr2[0]]-nums2[arr2[1]]
        );
        for(int i = 0 ; i < Math.min(k , nums1.length);i++){
            heap.offer(new int[]{
                    i, 0
            });
        }
        while(k-->0  && !heap.isEmpty()){
            int[] pair = heap.poll();
            int i = pair[0];
            int j = pair[1];
            pairs.add(List.of(nums1[i] , nums2[j]));
            if(j+1 < nums2.length){
                heap.offer(new int[]{
                   i  , j+1
                });
            }
        }
        return pairs;
    }
}
