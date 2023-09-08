package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters obj =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void shouldReturnLengthOfLongestSubstring() {
        Map<String, Integer> map = new HashMap<>();
        map.put("abcabcbb", 3);
        map.put("aab", 2);
        map.put("dvdf", 3);
        map.put("tmmzuxt", 5);
        var expected = map.values().toArray();

        List<Integer> actual = new ArrayList<>();
        List<Integer> actual1 = new ArrayList<>();
        List<Integer> actual2 = new ArrayList<>();
        map.forEach((k, v) -> actual.add(obj.lengthOfLongestSubstring(k)));
        map.forEach((k, v) -> actual1.add(obj.lengthOfLongestSubstring1(k)));
        map.forEach((k, v) -> actual2.add(obj.lengthOfLongestSubstring2(k)));

        Assertions.assertAll(
                () -> assertArrayEquals(expected, actual.toArray()),
                () -> assertArrayEquals(expected, actual1.toArray()),
                () -> assertArrayEquals(expected, actual2.toArray())
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
