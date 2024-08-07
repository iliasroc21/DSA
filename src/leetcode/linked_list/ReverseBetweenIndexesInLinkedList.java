package leetcode.linked_list;

public class ReverseBetweenIndexesInLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right){
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        for(int i  =0 ; i < left -1 ; i++){
            previous = previous.next;
        }
        ListNode current = previous.next;
        for(int i = 0 ; i < right -left ;i++){
            ListNode nodeToMove = current.next;
            current.next = nodeToMove.next;
            nodeToMove.next = previous.next;
            previous.next = nodeToMove;
        }

        return dummy.next;
    }
}
