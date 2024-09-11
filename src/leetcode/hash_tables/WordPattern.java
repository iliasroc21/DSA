package leetcode.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strs  = s.split(" ");
        if(pattern.length()!=strs.length)return false;
        Map<Character , String> map = new HashMap<>();
        Map<String , Character> reversedMap = new HashMap<>();
        for(int i = 0 ; i < pattern.length();i++){
            char c = pattern.charAt(i);
            String str = strs[i];
            if(map.containsKey(c) && !map.get(c).equals(str))return false;
            if(reversedMap.containsKey(str) && !reversedMap.get(str).equals(c))return false;
            map.put(c , str);
            reversedMap.put(str, c);
        }
        return true;
    }
}
