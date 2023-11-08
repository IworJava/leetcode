package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /**
     * 11 ms, 43.27 MB
     */
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> check = new HashMap<>();

        for (char c : s.toCharArray()) {
            target.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            check.merge(c, 1, Integer::sum);
        }
        return target.equals(check);
    }

    /**
     * 2 ms, 43.27 MB
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}
