package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters obj =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void shouldReturnLengthOfLongestSubstring() {
        var map = Map.of(
                "abcabcbb", 3,
                "aab", 2,
                "dvdf", 3,
                "tmmzuxt", 5,
                "abba", 2
        );
        var expected = map.values().stream().toList();

        var actual = map.keySet().stream().map(obj::lengthOfLongestSubstring).toList();
        var actual1 = map.keySet().stream().map(obj::lengthOfLongestSubstring1).toList();
        var actual2 = map.keySet().stream().map(obj::lengthOfLongestSubstring2).toList();
        var actual3 = map.keySet().stream().map(obj::lengthOfLongestSubstring3).toList();

        Assertions.assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected, actual2),
                () -> assertEquals(expected, actual3)
        );
    }

    @Test
    void shouldReturnZeroOnEmptyString() {
        int expected = 0;

        int actual = obj.lengthOfLongestSubstring("");
        int actual1 = obj.lengthOfLongestSubstring1("");
        int actual2 = obj.lengthOfLongestSubstring2("");

        Assertions.assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected, actual2)
        );
    }

    @Test
    void shouldReturnZeroOnNull() {
        int expected = 0;

        int actual = obj.lengthOfLongestSubstring(null);
        int actual1 = obj.lengthOfLongestSubstring1(null);
        int actual2 = obj.lengthOfLongestSubstring2(null);

        Assertions.assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected, actual2)
        );
    }
}
