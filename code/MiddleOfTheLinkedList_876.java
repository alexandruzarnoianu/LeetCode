package code;

public class MiddleOfTheLinkedList_876 {
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
            int it = 0;
            ListNode copyHead = head;
            while (null != head) {
                head = head.next;
                it++;
            }
            int middle = it / 2;
            for (int i = 0; i < middle; i++) {
                copyHead = copyHead.next;
            }
            return copyHead;
        }
    }
}
