package code;

public class OddEvenLinkedList_328 {
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
        public ListNode oddEvenList(ListNode head) {
            if (null == head || null == head.next) {
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenStart = head.next;
            while (null != odd.next && null != even.next) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenStart;
            return head;
        }
    }
}
