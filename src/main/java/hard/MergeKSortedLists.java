package hard;

import java.util.Objects;

public class MergeKSortedLists {

    /**
     * 175 ms, 43.21 MB
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode current = null;
        int min = 0;

        while (true) {
            min = findMinIndex(lists);

            if (min < 0) {
                break;
            }
            if (result == null) {
                result = new ListNode();
                current = result;
            } else {
                current.next = new ListNode();
                current = current.next;
            }

            current.val = lists[min].val;
            lists[min] = lists[min].next;
        }
        return result;
    }

    private int findMinIndex(ListNode[] lns) {
        int min = -1;
        for (int i = 0; i < lns.length; i++) {
            if (lns[i] == null) {
                continue;
            }
            if ((min < 0 && lns[i] != null) ||
                (min >= 0 && lns[min].val > lns[i].val)
            ) {
                min = i;
            }
        }
        return min;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }
}
