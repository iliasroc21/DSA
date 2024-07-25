package leetcode.stack_and_queue;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 ;
    Stack<Integer> stack2;
    public void enqueue(int value){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }
    public Integer dequeue(){
        if(stack1.isEmpty())return null ;
        else return stack1.pop();
    }
}
