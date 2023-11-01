package easy;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    private final LinkedListCycle obj = new LinkedListCycle();

    @Test
    void shouldReturnTrueOnCycle() {
        ListNode l4 = new ListNode(-4);
        ListNode l3 = new ListNode(0, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(3, l2);
        l4.next = l2;

        boolean actual = obj.hasCycle(l1);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseIfNoCycle() {
        ListNode l4 = new ListNode(-4);
        ListNode l3 = new ListNode(0, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(3, l2);

        boolean actual = obj.hasCycle(l1);

        assertFalse(actual);
    }
}