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

        assertEquals(expected, actual);
    }
}