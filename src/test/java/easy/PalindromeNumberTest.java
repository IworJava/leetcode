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

        assertAll(
                () -> assertTrue(actual)
        );
    }

    @Test
    void shouldReturnFalse() {
        boolean actual = obj.isPalindrome(notPalindrome);

        assertAll(
                () -> assertFalse(actual)
        );
    }

    @Test
    void shouldReturnTrueOnZero() {
        boolean actual = obj.isPalindrome(0);

        assertAll(
                () -> assertTrue(actual)
        );
    }
}