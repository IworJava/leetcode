package hard;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

    private final MergeKSortedLists obj = new MergeKSortedLists();

    @Test
    void shouldReturnMergedLists() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4,
                        new ListNode(5, new ListNode(6))))))));

        ListNode actual = obj.mergeKLists(lists);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMergedLists1() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4,
                        new ListNode(5, new ListNode(6))))))));

        ListNode actual = obj.mergeKLists1(lists);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNullIfArrayIsEmpty() {
        ListNode[] lists = {};

        ListNode actual = obj.mergeKLists(lists);
        ListNode actual1 = obj.mergeKLists1(lists);

        Assertions.assertNull(actual);
        Assertions.assertNull(actual1);
    }
}
