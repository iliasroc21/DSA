package datastructures.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length ;
    class Node {
        Node prev;
        Node next ;
        int value ;
        Node(int value){this.value= value; }
        Node(){}
    }
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
        }
        else{
            newNode.prev = tail ;
            tail.next = newNode ;
        }
        tail = newNode ;
        length++;
    }
    public Node removeLast(){
        if(length == 0 )return null ;
        Node temp = tail ;
        if(length == 1){
            tail = null ;
            head= null;
        }
        else{
            tail = tail.prev;
            temp.prev= null ;
            tail.next = null ;
        }
        length--;
        return temp ;
    }
    public void prepend(int value){
        Node newNode= new Node(value);
        if(length == 0){
            head = newNode;
            tail =newNode ;
        }
        else{
            newNode.next = head ;
            head.prev= newNode;
            head = newNode ;
        }
        length++;
        
    }
    public Node removeFirst(){
        if(length == 0)return null ;
        Node temp = head ;
        if(length == 1){
            head = null ;
            tail =null ;
        }
        else{
            head = temp.next;
            head.prev = null ;
            temp.next =null ;
        }
        length--;
        return temp ;
    }
    public Node get(int index){
        if(index < 0 || index >= length)return null ;
        Node temp = index < length/2 ?  head : tail ;
        if(index < length /2)
            for(int i =0 ; i <index ;i++)temp= temp.next;
        else
            for(int i = length -1 ; i > index ; i--)temp = temp.prev;

        return temp ;


    }
    public boolean set(int index , int value){
        Node temp = get(index);
        if(temp==null)return false;
        temp.value = value;
        return true;

    }
    public boolean insert(int index ,int value){

        if(index < 0 || index >=length)return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true ;
        }
        Node newNode = new Node(value);
        Node before= get(index -1);
        newNode.next = before.next;
        newNode.prev = before;
        before.next.prev = newNode;
        before.next = newNode;
        length++;
        return true;

    }
    public Node remove(int index ){
        if(index < 0 || index>= length)return null ;
        if(index ==0)return removeFirst();
        if(index == length -1 )return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next =temp.next;
        temp.next = null ;
        temp.prev= null ;
        length--;
        return temp ;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }

}
