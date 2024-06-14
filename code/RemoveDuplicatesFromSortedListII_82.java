package code;

public class RemoveDuplicatesFromSortedListII_82 {
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode newHead = new ListNode();
            newHead.next = head;
            ListNode it = newHead;
            while(null != head){
                if(null != head.next && head.val == head.next.val){
                    while(null != head.next && head.val == head.next.val){
                        head = head.next;
                    }
                    it.next = head.next;
                } else {
                    it = it.next;
                }
                head = head.next;
            }
            return newHead.next;

        }
    }
}
