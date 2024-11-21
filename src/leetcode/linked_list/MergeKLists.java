package leetcode.linked_list;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1)return null ;
        ListNode l1 = lists[0];
        for(int i = 1 ; i < lists.length ;i++){
            ListNode l2 = lists[i];
            l1 = merge2Lists(l1 , l2);
        }
        return l1;
    }
    private ListNode merge2Lists(ListNode l1 , ListNode l2){
        ListNode dummy= new ListNode(0);
        ListNode result =dummy  ;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;
        }
        result.next = l1!=null ? l1  :l2 ;
        return dummy.next;
    }
}
