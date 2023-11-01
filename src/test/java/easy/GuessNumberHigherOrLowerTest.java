package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @Test
    void shouldReturnGuessedNumber() {
        int n = Integer.MAX_VALUE;
        int expected = n - 1;
        var obj = new GuessNumberHigherOrLower(expected);

        int actual = obj.guessNumber(n);
        int actual1 = obj.guessNumber(n);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}