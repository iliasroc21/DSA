package datastructures.stackAndQueue;

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.enqueue(5);
        myQueue.dequeue();
        myQueue.enqueue(6);

        System.out.println("\nQueue:");
        myQueue.printQueue();

//        Stack myStack = new Stack(4);
//        myStack.push(5);
//        myStack.push(6);
////        myStack.pop();
//
//
//
//        myStack.getTop();
//        myStack.getHeight();
//
//        System.out.println("\nStack:");
//        myStack.printStack();

    }

}
