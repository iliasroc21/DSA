package leetcode.linked_list;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0 , head);
        ListNode previous = dummy ;
        ListNode temp = head;
        while(temp!=null){
            while(temp.next!=null && temp.val == temp.next.val){
                temp = temp.next;
            }
            if(previous.next !=temp){
                previous.next=  temp.next ;
                temp = previous.next;
            }
            else{
                previous = previous.next;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
