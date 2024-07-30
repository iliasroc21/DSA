package leetcode.hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> strs){
        HashMap<String , List<String>> myHashMap = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);
            if(myHashMap.containsKey(canonical)){
                myHashMap.get(canonical).add(str);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(str);
                myHashMap.put(canonical , group);
            }
        }
        return new ArrayList<>(myHashMap.values());
    }
}
