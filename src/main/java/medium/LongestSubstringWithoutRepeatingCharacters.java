package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    /*
        6 ms, 43.5 MB
     */
    public int lengthOfLongestSubstring2(String s) {
        if (s == null) {
            return 0;
        }
        int result = 0;
        int len = s.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < len; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                int index = s.indexOf(c, j) + 1;
                for (; j < index; j++) {
                    set.remove(s.charAt(j));
                }
            }
            set.add(c);
            result = Math.max(result, set.size());
        }
        return result;
    }

    /**
     * 3 ms, 44.51 MB
     */
    public int lengthOfLongestSubstring3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int l = 0;
        int r = 0;

        for (; r < s.length(); r++) {
            Integer idx = map.put(s.charAt(r), r);

            if (idx != null) {
                result = Math.max(result, r - l);
                l = Math.max(l, idx + 1);
            }

        }
        return Math.max(result, r - l);
    }
}
