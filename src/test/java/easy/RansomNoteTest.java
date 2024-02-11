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

        boolean actual1_1 = obj.canConstruct(ransomNote, magazine1);
        boolean actual1_2 = obj.canConstruct(ransomNote, magazine2);
        boolean actual2_1 = obj.canConstruct1(ransomNote, magazine1);
        boolean actual2_2 = obj.canConstruct1(ransomNote, magazine2);

        assertAll(
                () -> assertEquals(expected1, actual1_1),
                () -> assertEquals(expected2, actual1_2),
                () -> assertEquals(expected1, actual2_1),
                () -> assertEquals(expected2, actual2_2)
        );
    }

    @Test
    void should_return_false_on_incorrect_data() {
        String ransomNote = "aa";
        String magazine = "a";

        boolean actual1_1 = obj.canConstruct(ransomNote, magazine);
        boolean actual1_2 = obj.canConstruct(null, magazine);
        boolean actual1_3 = obj.canConstruct(ransomNote, null);
        boolean actual2_1 = obj.canConstruct1(ransomNote, magazine);
        boolean actual2_2 = obj.canConstruct1(null, magazine);
        boolean actual2_3 = obj.canConstruct1(ransomNote, null);

        assertAll(
                () -> assertFalse(actual1_1),
                () -> assertFalse(actual1_2),
                () -> assertFalse(actual1_3),
                () -> assertFalse(actual2_1),
                () -> assertFalse(actual2_2),
                () -> assertFalse(actual2_3)
        );
    }
}
