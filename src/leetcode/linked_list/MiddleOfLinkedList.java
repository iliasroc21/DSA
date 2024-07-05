package leetcode.linked_list;

public class MiddleOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode middle = head;
        while( temp !=null && temp.next !=null){
            middle = middle.next;
            temp = temp.next.next;
        }
        return middle ;

    }

}
