package leetcode.stack_and_queue;

import java.util.Stack;

public class SortStack {
    public Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> additionalStack = new Stack<>();
        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!additionalStack.isEmpty() && additionalStack.peek() > temp ){
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while(!additionalStack.isEmpty()){
            stack.push(additionalStack.pop());
        }
        return stack;

    }
}
