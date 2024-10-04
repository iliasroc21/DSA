package leetcode.linked_list;

public  class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null)return head ;
        ListNode slow = head ;
        ListNode fast= head;
        ListNode pre = null;
        while(fast!=null && fast.next !=null){
            pre = slow;
            slow = slow.next;
            fast= fast.next.next;

        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return mergeSort(l1 ,l2);
    }
    private ListNode mergeSort(ListNode l1 , ListNode l2)
    {
        ListNode dummy = new ListNode(0);
        ListNode result =dummy ;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                result.next= l1;
                l1 = l1.next;
            }
            else{
                result.next= l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        if(l1!=null){
            result.next = l1;
        }
        if(l2!=null){
            result.next =l2;
        }
        return dummy.next;
    }
}
