package leetcode.linked_list;

public class PartitionList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode partition(ListNode head, int x) {
        if(head ==null)return null ;
        ListNode dummy1 = new ListNode(0) ;
        ListNode dummy2 = new ListNode(0);
        ListNode greater =dummy2;
        ListNode less =dummy1;
        ListNode temp = head;
        while(temp !=null){
            if(temp.val >=x){
                greater.next = temp ;
                greater = temp ;
            }
            else{
                less.next = temp ;
                less = temp ;
            }
            temp = temp.next ;
        }
        greater.next =null ;
        less.next = dummy2.next;
        head = dummy1.next;
        return head;
    }
}
