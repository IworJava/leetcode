package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    private final PalindromeNumber obj = new PalindromeNumber();
    private final int palindrome = 1324231;
    private final int notPalindrome = -1324231;

    @Test
    void shouldReturnTrue() {
        boolean actual = obj.isPalindrome(palindrome);
        boolean actual1 = obj.isPalindrome1(palindrome);
        boolean actual2 = obj.isPalindrome2(palindrome);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1),
                () -> assertTrue(actual2)
        );
    }

    @Test
    void shouldReturnFalse() {
        boolean actual = obj.isPalindrome(notPalindrome);
        boolean actual1 = obj.isPalindrome1(notPalindrome);
        boolean actual2 = obj.isPalindrome2(notPalindrome);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1),
                () -> assertFalse(actual2)
        );
    }

    @Test
    void shouldReturnTrueOnZero() {
        boolean actual = obj.isPalindrome(0);
        boolean actual1 = obj.isPalindrome1(0);
        boolean actual2 = obj.isPalindrome2(0);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1),
                () -> assertTrue(actual2)
        );
    }
}