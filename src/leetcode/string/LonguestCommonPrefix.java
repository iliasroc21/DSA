package leetcode.string;

import java.util.Arrays;

public class LonguestCommonPrefix {
    public String longuestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String shorter = strs[0] ;
        String taller = strs[strs.length-1];
        int index = 0 ;
        while(index < shorter.length() && index<taller.length()){
            if(shorter.charAt(index)==taller.charAt(index)) index++;
            else break ;
        }
        return shorter.substring(0 , index) ;
    }
}
