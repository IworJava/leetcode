package easy;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

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

    /**
     * 4 ms, 43.42 MB
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
