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
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int[] array = new int[size];
        curr = head;
        size = 0;
        while (curr != null) {
            array[size] = curr.val;
            size++;
            curr = curr.next;
        }
        
        for (int i=0, j=array.length-1; i<j; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
