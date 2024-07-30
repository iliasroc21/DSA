package leetcode.hash_tables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> mySet = new HashSet<>(myList);
        return new ArrayList<Integer>(mySet);
    }
}
