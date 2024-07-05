package datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.prepend(6);
        myLinkedList.set(0 , 10);
        myLinkedList.insert(2 , 7);
//        myLinkedList.reverse();

//        myLinkedList.removeLast();
//        myLinkedList.removeFirst();
        System.out.println("Index of 0 : "+myLinkedList.get(0).value);
        myLinkedList.printList();
    }
}
