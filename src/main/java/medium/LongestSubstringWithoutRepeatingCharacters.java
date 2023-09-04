package medium;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
        123 ms, 41.5 MB
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j == s.length() || s.indexOf(s.charAt(j), i) < j) {
                    result = Math.max(result, j - i);
                    break;
                }
            }
        }
        return result;
    }
}
