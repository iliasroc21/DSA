package leetcode.string;

import java.util.Stack;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int right = 0 ;
        int left =  0 ;
        for( right = 0 , left = 0 ; right <s.length() ; right++ ){
            char rightC = s.charAt(right);
            char leftC = s.charAt(left);
            if(rightC==' '){
                if(leftC==' '){
                    left++;
                }
                else{
                    String str = s.substring(left, right).trim();
                    stack.push(str);
                    left= right+1;
                }
            }
        }
        stack.push(s.substring(left));
        while(!stack.isEmpty()){
            String str =stack.pop();
            result.append(str).append(" ");
        }
        return result.toString().trim() ;
    }
}
