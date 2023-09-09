package easy;

import java.util.ArrayDeque;

public class PalindromeNumber {

    /*
        12 ms, 42.9 MB
     */
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().contentEquals(new StringBuilder(String.valueOf(x)));
    }

    /*
        10 ms, 42.1 MB
     */
    public boolean isPalindrome1(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /*
        6 ms, 42.5 MB
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /*
        6 ms, 42.3 MB
     */
    public boolean isPalindrome3(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        var deque = new ArrayDeque<Byte>();
        while (x != 0) {
            deque.add((byte) (x % 10));
            x = x / 10;
        }
        while (!deque.isEmpty()) {
            var first = deque.pollFirst();
            var last = deque.pollLast();
            if (last != null && !first.equals(last)) {
                return false;
            }
        }
        return true;
    }

    /*
        5 ms, 42.7 MB
     */
    public boolean isPalindrome4(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int len = 0;
        var arr = new int[10];
        for (; x != 0; len++) {
            arr[len] = x % 10;
            x = x / 10;
        }
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
