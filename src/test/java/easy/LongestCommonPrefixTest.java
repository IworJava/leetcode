package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LongestCommonPrefixTest {

    private static final String[] stringsWithCommonPrefix = {"flower","flow","flight"};
    private static final String[] stringsWithoutCommonPrefix = {"dog","racecar","car"};
    private static final String[] emptyArr = {};

    @Test
    void shouldReturnCommonPrefix() {
        String expected = "fl";

        var actual = new LongestCommonPrefix().longestCommonPrefix(stringsWithCommonPrefix);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected, actual)
        );
    }

    @Test
    void shouldReturnEmptyPrefix() {
        String expected = "";

        var actual = new LongestCommonPrefix().longestCommonPrefix(stringsWithoutCommonPrefix);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected, actual)
        );
    }

    @Test
    void shouldReturnEmptyResultWhenArrayIsEmpty() {
        String expected = "";

        var actual = new LongestCommonPrefix().longestCommonPrefix(emptyArr);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected, actual)
        );
    }

    @Test
    void shouldReturnEmptyResultWhenArrayIsNull() {
        String expected = "";

        var actual = new LongestCommonPrefix().longestCommonPrefix(null);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected, actual)
        );
    }
}