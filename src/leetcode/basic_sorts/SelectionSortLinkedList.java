package leetcode.basic_sorts;

public class SelectionSortLinkedList {
    public static ListNode selectionSort(ListNode head){
        if(head==null || head.next == null)return head;
        ListNode current = head;
        while(current.next!=null){
            ListNode smallest = current ;
            ListNode innerCurrent = current.next;
            while(innerCurrent!=null){
                if(innerCurrent.val > smallest.val){
                    int temp = current.val;
                    current.val = smallest.val;
                    smallest.val = temp;
                }
                innerCurrent = innerCurrent.next;
            }
            current = current.next;
        }
        return head;

    }
}
