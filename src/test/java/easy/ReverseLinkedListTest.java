package easy;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private final ReverseLinkedList obj = new ReverseLinkedList();

    @Test
    void shouldReturnReversedList() {
        ListNode list = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(1)))));

        ListNode actual = obj.reverseList(list);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNullIfArgumentIsNull() {
        ListNode actual = obj.reverseList(null);

        assertNull(actual);
    }
}