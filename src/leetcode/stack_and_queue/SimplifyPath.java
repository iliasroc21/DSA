package leetcode.stack_and_queue;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for(String str : path.split("/")){
            if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(str.equals(".") || str.isEmpty())continue;
            else stack.push(str);
        }
        return "/"+String.join("/", stack);
    }
}
