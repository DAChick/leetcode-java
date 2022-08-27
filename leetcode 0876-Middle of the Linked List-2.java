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
    public ListNode middleNode(ListNode head) {
        boolean move = true;
        ListNode oneStep = head;
        ListNode twoStep = head.next;
        
            while (twoStep != null) {
            if (move){
                oneStep = oneStep.next;
                }
                twoStep = twoStep.next;
                move = !move;
            }
        return oneStep;
    }
}
