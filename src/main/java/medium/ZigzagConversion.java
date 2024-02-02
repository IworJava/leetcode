package medium;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows (4) like this:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * And then read line by line: "PINALSIGYAHRPI"
 */
public class ZigzagConversion {

    /**
     * 4 ms, 44.22 MB
     */
    public String convert(String s, int numRows) {
        if (s == null || numRows == 0) {
            return "";
        }
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        boolean grow = false;
        int i = 0;

        for (char c : s.toCharArray()) {
            sb[i].append(c);
            if (i == 0 || i == numRows - 1) {
                grow = !grow;
            }
            i += grow ? 1 : -1;
        }
        for (i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
