package easy;

import common.ListNode;

public class ReverseLinkedList {

    /**
     * 0 ms, 40.78 MB
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
