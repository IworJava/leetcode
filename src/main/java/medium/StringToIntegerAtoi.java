package medium;

/**
 * Convert a string to a 32-bit signed integer:
 * 1. Read in and ignore any leading whitespace.
 * 2. Check if the next character (if not already at the end of the string) is '-' or '+'.
 * Read this character in if it is either. This determines if the final result is
 * negative or positive respectively. Assume the result is positive if neither is present.
 * 3. Read in next the characters until the next non-digit character or
 * the end of the input is reached. The rest of the string is ignored.
 * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no
 * digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * 5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range. Specifically, integers
 * less than -231 should be clamped to -231, and integers greater than 231 - 1
 * should be clamped to 231 - 1.
 * 6. Return the integer as the final result.
 */
public class StringToIntegerAtoi {

    /**
     * 1 ms, 41.83 MB
     */
    public int myAtoi(String s) {
        double result = 0;
        boolean negative = false;
        int i = 0;
        char c = 0;

        for (; i < s.length(); i++) {
            c = s. charAt(i);
            if (c != ' ') {
                break;
            }
        }
        if (c == '-' || c == '+') {
            negative = c == '-';
            i++;
        }
        for (; i < s.length(); i++) {
            c = s. charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            result *= 10;
            result += c - '0';
        }
        if (negative) result = -result;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}
