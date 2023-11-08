package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final ValidAnagram obj = new ValidAnagram();

    @Test
    void shouldReturnTrue() {
        String s = "anagram";
        String t = "nagaram";

        boolean actual = obj.isAnagram(s, t);
        boolean actual1 = obj.isAnagram1(s, t);
        boolean actual2 = obj.isAnagram2(s, t);

        assertAll(
                () -> assertTrue(actual),
                () -> assertTrue(actual1),
                () -> assertTrue(actual2)
        );

    }

    @Test
    void shouldReturnFalse() {
        String s = "cat";
        String t = "rat";

        boolean actual = obj.isAnagram(s, t);
        boolean actual1 = obj.isAnagram1(s, t);
        boolean actual2 = obj.isAnagram2(s, t);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1),
                () -> assertFalse(actual2)
        );
    }
}