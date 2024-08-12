package leetcode.basic_sorts;

public class InsertionSortLinkedList {
    public ListNode insertionSortList(ListNode head) {

        ListNode sortedListHead = head;
        ListNode unsortedListHead = head.next;
        sortedListHead.next = null ;
        while(unsortedListHead!=null){
            ListNode current = unsortedListHead ;
            unsortedListHead = unsortedListHead.next;
            if(current.val < sortedListHead.val){
                current.next = sortedListHead;
                sortedListHead = current ;
            }
            else{
                ListNode searchNode = sortedListHead ;
                while(searchNode.next!=null && current.val > searchNode.next.val){
                    searchNode = searchNode.next;

                }
                current.next = searchNode.next;
                searchNode.next = current;

            }
        }
        return sortedListHead;

    }
}
