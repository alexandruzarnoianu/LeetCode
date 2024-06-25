package code;

public class DeleteNodeInALinkedList_237 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode it = node;
            while (null != it.next) {
                it.val = it.next.val;
                if (null == it.next.next) {
                    it.next = null;
                    return;
                }
                it = it.next;
            }
        }
    }
}
