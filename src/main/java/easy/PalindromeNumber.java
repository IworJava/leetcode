package easy;

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
}
