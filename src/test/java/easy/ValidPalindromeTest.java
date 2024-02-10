package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome obj = new ValidPalindrome();

    @Test
    void should_return_true() {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = " ";
        String s3 = "Ab_a";

        boolean actual1_1 = obj.isPalindrome(s1);
        boolean actual1_2 = obj.isPalindrome(s2);
        boolean actual1_3 = obj.isPalindrome(s3);
        boolean actual2_1 = obj.isPalindrome1(s1);
        boolean actual2_2 = obj.isPalindrome1(s2);
        boolean actual2_3 = obj.isPalindrome1(s3);

        assertAll(
                () -> assertTrue(actual1_1),
                () -> assertTrue(actual1_2),
                () -> assertTrue(actual1_3),
                () -> assertTrue(actual2_1),
                () -> assertTrue(actual2_2),
                () -> assertTrue(actual2_3)
        );
    }

    @Test
    void should_return_false() {
        String s = "race a car";

        boolean actual1 = obj.isPalindrome(s);
        boolean actual2 = obj.isPalindrome1(s);

        assertAll(
                () -> assertFalse(actual1),
                () -> assertFalse(actual2)
        );
    }
}