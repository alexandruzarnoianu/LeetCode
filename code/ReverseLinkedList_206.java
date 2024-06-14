package code;

public class ReverseLinkedList_206 {
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
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            ListNode forward = null;
            while (null != current) {
                forward = current.next;
                current.next = prev;
                prev = current;
                current = forward;
            }
            return prev;
        }
    }
}
