package leetcode.linked_list;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        HashMap<Node,  Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            map.put(temp ,newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }

}
