package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private final ValidParentheses obj = new ValidParentheses();
    private final String validString = "[]((){})";
    private final String invalidString = "((){)}";

    @Test
    void shouldReturnTrueWhenStringIsValid() {
        boolean actual = obj.isValid(validString);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenStringIsInvalid() {
        boolean actual = obj.isValid(invalidString);

        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenStringIsEmpty() {
        boolean actual = obj.isValid("");

        assertTrue(actual);
    }
}