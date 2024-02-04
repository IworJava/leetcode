package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {

    private final StringToIntegerAtoi obj = new StringToIntegerAtoi();

    @Test
    void should_return_correct_result() {
        String s = "42";
        String s1 = "   -0042";
        String s2 = "  4193 with words";
        int expected = 42;
        int expected1 = -42;
        int expected2 = 4193;

        int actual = obj.myAtoi(s);
        int actual1 = obj.myAtoi(s1);
        int actual2 = obj.myAtoi(s2);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1),
                () -> assertEquals(expected2, actual2)
        );
    }

    @Test
    void should_return_zero_if_string_is_incorrect() {
        String s = "  +-42";
        String s1 = "  -+42";
        String s2 = "words and 987";
        String s3 = "";
        int expected = 0;

        int actual = obj.myAtoi(s);
        int actual1 = obj.myAtoi(s1);
        int actual2 = obj.myAtoi(s2);
        int actual3 = obj.myAtoi(s3);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected, actual2),
                () -> assertEquals(expected, actual3)
        );
    }
}
