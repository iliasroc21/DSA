package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringConcatenatedWords {
    public List<Integer> findSubString(String s , String[] words){
        int n = words[0].length() ;
        int m = words.length ;
        List<Integer> result = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word ,map.getOrDefault(word ,0)+1);
        }
        for(int left = 0 , right =0 ; right<s.length(); right++){
            if(right-left+1==n*m){
                String word = s.substring(left, right+1);
                HashMap<String , Integer> cloneMap = new HashMap<>();
                for(int p = 0 ; p <word.length() ;p+=n){
                    String temp = word.substring(p , p +n);
                    cloneMap.put(temp ,map.getOrDefault(cloneMap ,0)+1);
                }
                if(map.equals(cloneMap)){
                    result.add(left);
                }
                left++;
            }
        }
        return result ;

    }

}
