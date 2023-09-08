package medium;

import java.util.HashMap;
import java.util.Map;

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

    /*
        5 ms, 43.6 MB
     */
    public int lengthOfLongestSubstring1(String s) {
        if (s == null) {
            return 0;
        }
        int len = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= j) {
                j = map.get(c) + 1;
            }
            result = Math.max(result, i - j + 1);
            map.put(s.charAt(i), i);
        }
        return result;
    }
}
