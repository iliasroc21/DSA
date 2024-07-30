package leetcode.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {
    public static boolean hasUniqueChars(String string){
        Set<Character> mySet = new HashSet<>();
        for(char c : string.toCharArray()){
            if(mySet.contains(c)){
                return false;
            }
            mySet.add(c);
        }
        return true;
    }
}
