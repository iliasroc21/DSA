package leetcode.basic_sorts;

import java.util.LinkedList;

public class BubbleSortLinkedList {
    public static ListNode bubbleSort(ListNode head){
        if(head==null || head.next == null)return head;
        ListNode sortedUntil = null ;
        while(sortedUntil != head.next ){
            ListNode current = head;
            while(current.next != sortedUntil){
                ListNode nextNode = current.next;
                if(current.val > nextNode.val){
                    int temp = current.val ;
                    current.val = nextNode.val;
                    nextNode.val = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
        return head;
    }

}
