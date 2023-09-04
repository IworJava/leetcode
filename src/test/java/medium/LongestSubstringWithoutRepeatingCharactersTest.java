package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final String str = "abcabcbb";

    @Test
    void shouldReturnLengthOfLongestSubstring() {
        int expected = 3;

        int actual = new LongestSubstringWithoutRepeatingCharacters()
                .lengthOfLongestSubstring(str);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroOnEmptyString() {
        int expected = 0;

        int actual = new LongestSubstringWithoutRepeatingCharacters()
                .lengthOfLongestSubstring("");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroOnNull() {
        int expected = 0;

        int actual = new LongestSubstringWithoutRepeatingCharacters()
                .lengthOfLongestSubstring(null);

        Assertions.assertEquals(expected, actual);
    }
}