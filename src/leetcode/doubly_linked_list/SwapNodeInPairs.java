package leetcode.doubly_linked_list;

public class SwapNodeInPairs {
    class ListNode {
        ListNode prev;
        ListNode next;
        int value ;
        ListNode(int value){
            this.value = value;
        }
        ListNode(){

        }
    }
    public ListNode swapInPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy ;
        while(head !=null && head.next !=null){
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            previous.next = secondNode;
            firstNode.next= secondNode.next;
            secondNode.next = firstNode ;
            secondNode.prev = previous;
            firstNode.prev = secondNode;
            if(firstNode.next!=null){
                firstNode.next.prev = firstNode;
            }
            head = head.next;
            previous = firstNode;
        }
        head = dummy.next;
        if(head!=null)head.prev=null ;
        return head;
    }
}
