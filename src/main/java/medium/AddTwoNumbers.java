package medium;

public class AddTwoNumbers {

    /**
     * 1 ms, 42.9 MB
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode current = null;
        int sum = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            sum += val1 + val2;

            if (result == null) {
                result = new ListNode();
                current = result;
            } else {
                current.next = new ListNode();
                current = current.next;
            }
            current.val = sum % 10;
            sum /= 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (sum != 0) {
            current.next = new ListNode(sum);
        }
        return result;
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
        public String toString() {
            return val + " - " + next;
        }

    }
}
