package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome obj = new ValidPalindrome();

    @Test
    void should_return_true() {
        String s = "A man, a plan, a canal: Panama";
        String s1 = " ";
        String s2 = "Ab_a";
        String s3 = "race a car";

        boolean actual = obj.isPalindrome(s);
        boolean actual1 = obj.isPalindrome(s1);
        boolean actual2 = obj.isPalindrome(s2);
        boolean actual3 = obj.isPalindrome(s3);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1),
                () -> assertTrue(actual2),
                () -> assertFalse(actual3)
        );
    }

    @Test
    void should_return_false() {
        String s = "race a car";

        boolean actual = obj.isPalindrome(s);

        assertAll(
                () -> assertFalse(actual)
        );
    }
}