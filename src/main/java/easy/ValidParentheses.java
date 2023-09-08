package easy;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ValidParentheses {

    /*
        2 ms, 40 MB
     */
    public boolean isValid(String s) {
        var opened = Arrays.asList('(', '[', '{');
        var closed = Arrays.asList(')', ']', '}');
        var queue = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (opened.contains(c)) {
                queue.addFirst(closed.get(opened.indexOf(c)));
            } else if (closed.contains(c)) {
                if (queue.isEmpty() || (char) queue.removeFirst() != c) {
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}
