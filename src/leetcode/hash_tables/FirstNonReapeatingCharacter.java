package leetcode.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReapeatingCharacter {
    public static Character firstNonRepeatingCharacter(String string){
        HashMap<Character , Integer> myHashMap = new HashMap<>();

        for(char c : string.toCharArray()){
            myHashMap.put(c , myHashMap.getOrDefault(c , 0)+1);
        }
        for(Map.Entry<Character ,Integer> entry :myHashMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;

    }
}
