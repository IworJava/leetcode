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

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalse() {
        String s = "cat";
        String t = "rat";

        boolean actual = obj.isAnagram(s, t);

        assertFalse(actual);
    }
}