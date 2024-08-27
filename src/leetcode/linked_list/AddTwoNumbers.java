package leetcode.linked_list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy ;
        int carry = 0 ;
        while(l1!=null || l2!=null || carry!=0){
            int value1 = (l1 ==null ) ? 0 : l1.val;
            int value2 = (l2 ==null) ? 0 : l2.val;
            int sum = value1 + value2 + carry ;
            int sumDigit = sum % 10;
            carry = sum / 10;
            tail.next = new ListNode(sumDigit);
            tail = tail.next;
            l1 = (l1 !=null) ? l1.next :null ;
            l2 = (l2 !=null) ? l2.next : null ;
        }
        return dummy.next;
    }
}
