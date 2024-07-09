package datastructures.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.append(5);
        myDLL.prepend(8);
//        myDLL.removeLast();
//        myDLL.removeFirst();
//        myDLL.set(0 , 10);
//        myDLL.insert(2  , 9);
//        myDLL.remove(2);
//        System.out.println("Node at index 4 " + myDLL.get(4).value);
        myDLL.printList();


    }
}
