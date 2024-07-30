package leetcode.hash_tables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        List<int[]> result = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        for(int num : arr1){
            mySet.add(num);
        }
        for(int num : arr2){
            if(mySet.contains(target-num)){
                result.add(new int[]{target-num , num});

            }
        }
        return result;
    }
}
