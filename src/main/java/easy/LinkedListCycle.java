package easy;

import common.ListNode;

public class LinkedListCycle {

    /**
     * 0 ms, 43.2 MB
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != l2) {
            if (l2 == null || l2.next == null) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return true;
    }
}
