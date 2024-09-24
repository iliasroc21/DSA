package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s){
        Map<Character  ,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0 ;
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ;i++){
            if(i+1< chars.length && map.get(chars[i])<map.get(chars[i+1])){
                result-=map.get(chars[i]);
            }
            else{
                result +=map.get(chars[i]);
            }
        }
        return result;
    }
}
