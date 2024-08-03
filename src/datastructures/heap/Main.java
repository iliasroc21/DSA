package datastructures.heap;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(100);
        myHeap.insert(99);
        myHeap.insert(75);
        myHeap.insert(58);
        myHeap.insert(72);
        myHeap.insert(61);

        System.out.println(myHeap.getHeap());
        myHeap.remove();
        myHeap.remove();
        System.out.println(myHeap.getHeap());


    }
}
