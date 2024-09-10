package leetcode.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(t.length()!=s.length())return false;
        Map<Character , Character> mapS2T = new HashMap<>();
        Map<Character , Character> mapT2S = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char charS= s.charAt(i);
            char charT = t.charAt(i);
            if(mapS2T.containsKey(charS)){
                if(mapS2T.get(charS)!=charT)return false;
            }
            else{
                if(mapT2S.containsKey(charT))return false;
                mapS2T.put(charS  ,charT);
                mapT2S.put(charT ,charS);
            }
        }
        return true ;
    }
}
