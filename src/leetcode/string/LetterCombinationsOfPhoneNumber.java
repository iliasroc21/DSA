package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    Map<Character, String> map = new HashMap<>();
    List<String > result = new ArrayList<>();
    public List<String> letterCombinations(String digits){
        if(digits.isEmpty())return result;
        map.put('2'  , "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder currentCombination = new StringBuilder();
        backTrack(digits , 0  ,currentCombination);
        return result ;
    }
    private void backTrack(String digits , int index, StringBuilder currentCombination ){
        if(index==digits.length()){
            result.add(currentCombination.toString());
            return ;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for(char letter : letters.toCharArray()){
            currentCombination.append(letter);
            backTrack(digits , index+1 ,currentCombination);
            currentCombination.deleteCharAt(currentCombination.length()-1);
        }
    }
}
