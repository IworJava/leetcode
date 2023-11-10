package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement obj =
            new LongestRepeatingCharacterReplacement();

    @Test
    void shouldReturnValidResult() {
        String s = "AABABBBABAAAAA";
        int k = 2;
        int expected = 8;

        int actual = obj.characterReplacement(s, k);
        int actual1 = obj.characterReplacement1(s, k);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}
