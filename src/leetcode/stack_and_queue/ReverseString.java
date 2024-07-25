package leetcode.stack_and_queue;

import java.util.Stack;

public class ReverseString {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for(char elem : s){
            stack.push(elem);
        }
        for(int i = 0 ; i < s.length;i++){
            s[i]= stack.pop();
        }

    }
}
