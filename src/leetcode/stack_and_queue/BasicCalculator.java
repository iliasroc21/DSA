package leetcode.stack_and_queue;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s){
        int result= 0  ;
        int number = 0 ;
        int sign = 1 ;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c)){
                number= 10*number + (int )(c-'0');
            }
            else if(c=='+'){
                result += sign*number;
                number=0;
                sign = 1 ;
            }
            else if(c=='-'){
                result +=sign*number;
                number = 0;
                sign=-1;
            }
            else if(c=='('){
                stack.push(result);
                stack.push(sign);
                sign = 1 ;
                result = 0 ;
            }
            else if(c==')'){
                result +=sign*number;
                result *=stack.pop();
                result+=stack.pop();
                number= 0 ;
            }
        }
        if(number!=0)result +=sign*number;
        return result;

    }
}
