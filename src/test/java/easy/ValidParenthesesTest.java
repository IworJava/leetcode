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
        boolean actual1 = obj.isValid1(validString);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1)
        );
    }

    @Test
    void shouldReturnFalseWhenStringIsInvalid() {
        boolean actual = obj.isValid(invalidString);
        boolean actual1 = obj.isValid1(invalidString);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1)
        );
    }

    @Test
    void shouldReturnTrueWhenStringIsEmpty() {
        boolean actual = obj.isValid("");
        boolean actual1 = obj.isValid1("");

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1)
        );
    }
}