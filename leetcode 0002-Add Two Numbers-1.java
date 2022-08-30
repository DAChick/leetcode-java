/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = null;
        ListNode current = null;
        int num1 = 0;
        int num2 = 0;
        int nextVal = 0;
        int carry = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            keepGoing = false;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
                if (l1 != null) {keepGoing = true;}
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
                if (l2 != null) {keepGoing = true;}
            }
            nextVal = num1+num2+carry;
            carry = 0;
            num1 = 0;
            num2 = 0;
            if (nextVal >= 10) {
                nextVal -= 10;
                carry = 1;
            }
            if (answer == null) {
                answer = new ListNode(nextVal);
                current = answer;
            } else {
                current.next = new ListNode(nextVal);
                current = current.next;
            }
            
        }
        if (carry == 1) {
            current.next = new ListNode(1);
        }
        return answer;
    }
}
