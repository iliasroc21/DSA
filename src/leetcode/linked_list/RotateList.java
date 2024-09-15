package leetcode.linked_list;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k ){
        if(head==null || head.next==null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next= head;
        ListNode fast = dummy, slow = dummy ;
        int size = 0;
        for(size = 0 ; fast.next!=null ;size++ ){
            fast = fast.next;
        }
        for(int j = 0 ; j < size- k%size ; j++){
            slow = slow.next;
        }
        fast.next= dummy.next;
        dummy.next  = slow.next;
        slow.next= null ;
        return dummy.next;
    }

}
