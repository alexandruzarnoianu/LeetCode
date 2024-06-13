package src;

public class RotateList_61 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (null == head || null == head.next) {
                return head;
            }

            int length = 1;
            ListNode it = head;
            while (null != it.next) {
                it = it.next;
                length++;
            }

            int steps = k % length;

            for (int i = 0; i < steps; i++) {
                ListNode prev = head;
                it = head.next;
                while (null != it.next) {
                    prev = it;
                    it = it.next;
                }
                it.next = head;
                prev.next = null;
                head = it;
            }
            return head;
        }
    }
}
