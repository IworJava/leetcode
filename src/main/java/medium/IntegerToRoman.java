package medium;


public class IntegerToRoman {

    /**
     * 3 ms, 44.35 MB
     */
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException();
        }
        int[] arabs = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();

        for (int i = arabs.length - 1; i >= 0; i--) {
            while (num >= arabs[i]) {
                sb.append(romans[i]);
                num -= arabs[i];
            }
        }
        return sb.toString();
    }
}
