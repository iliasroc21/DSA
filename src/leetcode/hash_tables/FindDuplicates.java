package leetcode.hash_tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer , Integer> myHashMap = new HashMap<>();
        for(int num :nums){
            myHashMap.put(num , myHashMap.getOrDefault(num ,0)+1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : myHashMap.entrySet()){
            if(entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;

    }
}
