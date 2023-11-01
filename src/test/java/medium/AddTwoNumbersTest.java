package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    private final AddTwoNumbers obj = new AddTwoNumbers();

    @Test
    void shouldReturnCorrectResult() {
        int num1 = 9999;
        int num2 = 99;
        int sum = num1 + num2;
        var l1 = convertFromInt(num1);
        var l2 = convertFromInt(num2);
        var expected = convertFromInt(sum);

        var actual = obj.addTwoNumbers(l1, l2);

        assertEquals(convertToInt(expected), convertToInt(actual));
    }

    private ListNode convertFromInt(int num) {
        ListNode first = null;
        ListNode current = null;
        while (num != 0) {
            if (current == null) {
                current = new ListNode(num % 10);
            } else {
                current.next = new ListNode(num % 10);
                current = current.next;
            }
            num /= 10;
            if (first == null) {
                first = current;
            }
        }
        return first;
    }

    private int convertToInt(ListNode l) {
        StringBuilder sb = new StringBuilder();
        while (l != null) {
            sb.append(l.val);
            l = l.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
}