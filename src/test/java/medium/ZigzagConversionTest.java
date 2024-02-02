package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {

    private final ZigzagConversion obj = new ZigzagConversion();

    @Test
    void valid_result_when_numRows_lt_string() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        int numRows1 = 4;
        String expected = "PAHNAPLSIIGYIR";
        String expected1 = "PINALSIGYAHRPI";

        String actual = obj.convert(s, numRows);
        String actual1 = obj.convert(s, numRows1);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1)
        );
    }

    @Test
    void return_s_when_numRows_gt_string() {
        String s = "PAY";
        int numRows = 4;
        String expected = "PAY";

        String actual = obj.convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    void return_s_when_numRows_eq_1() {
        String s = "PAYPALISHIRING";
        int numRows = 1;
        String expected = "PAYPALISHIRING";

        String actual = obj.convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    void empty_string_when_numRows_eq_0() {
        String s = "PAYPALISHIRING";
        int numRows = 0;
        String expected = "";

        String actual = obj.convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    void empty_string_when_s_is_null() {
        String s = null;
        int numRows = 1;
        String expected = "";

        String actual = obj.convert(s, numRows);

        assertEquals(expected, actual);
    }
}