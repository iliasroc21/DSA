package leetcode.linked_list;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    int capacity ;
    Map<Integer, Node> map = new HashMap<>();
    Node  head = new Node(-1 ,-1);
    Node tail = new Node(-1 , -1);

    public LRUCache(int capacity) {
        this.capacity = capacity ;
        head.next=  tail ;
        tail.prev =head;

    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            //some other logic
            removeNode(temp);
            addNode(temp);
            return temp.val ;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            map.remove(key);
            removeNode(temp);

        }
        if(map.size()==capacity){
            map.remove(tail.prev.key);
            removeNode(tail.prev);

        }
        addNode(new Node(key , value));
        map.put(key , head.next);
    }
    private void removeNode(Node node){
        Node prev = node.prev;
        Node next =node.next;
        prev.next = next;
        next.prev =prev;
    }

    private void addNode(Node node){
        Node temp = head.next;
        temp.prev=node;
        head.next =node;
        node.next=  temp;
        node.prev= head;
    }
}
