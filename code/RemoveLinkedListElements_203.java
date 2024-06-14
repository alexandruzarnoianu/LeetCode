package code;

public class RemoveLinkedListElements_203 {
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
        public ListNode removeElements(ListNode head, int val) {
            ListNode newHead = new ListNode();
            newHead.next = head;
            ListNode result = newHead;
            while (null != head) {
                if (null != head && head.val == val) {
                    while (null != head && head.val == val) {
                        head = head.next;
                    }
                }
                newHead.next = head;
                newHead = newHead.next;
                if (null == head) {
                    return result.next;
                }
                head = head.next;
            }
            return result.next;
        }
    }
}
