package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        String result = "";
        if(s.length() < t.length())
            return result;
        int minWindow = Integer.MAX_VALUE;
        int need = t.length();
        int have = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(char tC : t.toCharArray()){

            tMap.put(tC, tMap.getOrDefault(tC,0)+1);
        }
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            sMap.put(ch, sMap.getOrDefault(ch,0)+1);
            if(tMap.containsKey(ch) && sMap.get(ch)<=(tMap.get(ch))){
                have++;
            }
            while(have==need){
                if(minWindow > right-left+1){
                    minWindow = right-left+1;
                    result = s.substring(left, right+1);
                }
                char charToRemove = s.charAt(left);
                if(sMap.get(charToRemove) == 1){
                    sMap.remove(charToRemove);
                }else{
                    sMap.put(charToRemove, sMap.get(charToRemove)-1);
                }
                left++;
                if(tMap.containsKey(charToRemove) && sMap.getOrDefault(charToRemove,0)<(tMap.get(charToRemove))){
                    have--;
                }
            }
        }
        return result;
    }

}
