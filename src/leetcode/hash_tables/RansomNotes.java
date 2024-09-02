package leetcode.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class RansomNotes {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character , Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            map.put(c , map.getOrDefault(c , 0 )+1);
        }
        for(char c : ransomNote.toCharArray()){
            int count= map.getOrDefault(c , 0 );
            if(count > 0){
                map.put(c , count-1);
            }
            else{
                return false;
            }
        }
        return true ;
    }
}
