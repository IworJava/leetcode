package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    private final IntegerToRoman obj = new IntegerToRoman();

    @Test
    void should_return_correct_result() {
        int num = 58;
        int num1 = 1994;
        int num2 = 3999;
        String expected = "LVIII";
        String expected1 = "MCMXCIV";
        String expected2 = "MMMCMXCIX";

        String actual = obj.intToRoman(num);
        String actual1 = obj.intToRoman(num1);
        String actual2 = obj.intToRoman(num2);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2)
        );
    }

    @Test
    void should_throw_exception() {
        int num = 0;
        int num1 = 4000;

        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> obj.intToRoman(num)),
                () -> assertThrows(IllegalArgumentException.class, () -> obj.intToRoman(num1))
        );
    }
}