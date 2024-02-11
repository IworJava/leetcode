package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    private final RansomNote obj = new RansomNote();

    @Test
    void should_return_correct_result() {
        String ransomNote = "aa";
        String magazine1 = "ab";
        String magazine2 = "aab";
        boolean expected1 = false;
        boolean expected2 = true;

        boolean actual1 = obj.canConstruct(ransomNote, magazine1);
        boolean actual2 = obj.canConstruct(ransomNote, magazine2);

        assertAll(
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2)
        );
    }

    @Test
    void should_return_false_on_incorrect_data() {
        String ransomNote = "aa";
        String magazine = "a";

        boolean actual = obj.canConstruct(ransomNote, magazine);
        boolean actual1 = obj.canConstruct(null, magazine);
        boolean actual2 = obj.canConstruct(ransomNote, null);

        assertAll(
                () -> assertFalse(actual),
                () -> assertFalse(actual1),
                () -> assertFalse(actual2)
        );
    }
}