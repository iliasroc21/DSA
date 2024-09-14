package leetcode.linked_list;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head , int k ){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy ;
        while(previous!=null){
            previous = reverseKNodes(previous , k);
        }
        return dummy.next;
    }
    private ListNode reverseKNodes(ListNode start , int k){
        ListNode head= start.next;
        ListNode current = head;
        ListNode last= head ;
        for(int i = 0 ; i < k ; i++){
            if(last==null)return null ;
            last =last.next;
        }
        for(int i = 0 ; i < k ;i++){
            ListNode nodeToMove = current.next;
            current.next =last;
            last = current ;
            current =nodeToMove;
        }
        start.next = last;
        return head;
    }

}
