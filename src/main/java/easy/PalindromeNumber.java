package easy;

public class PalindromeNumber {

    /*
        12 ms, 42.9 MB
     */
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().contentEquals(new StringBuilder(String.valueOf(x)));
    }
}
