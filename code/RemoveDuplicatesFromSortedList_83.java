package code;


public class RemoveDuplicatesFromSortedList_83 {
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            ListNode it = head;
            while (null != it) {
                while (current.val == it.val) {
                    if (it.next == null && it.val == current.val) {
                        current.next = null;
                        return head;
                    }
                    it = it.next;
                }
                current.next = it;
                current = it;
            }
            return head;
        }
    }
}
