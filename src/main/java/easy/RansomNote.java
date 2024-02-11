package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    /**
     * 6 ms, 44.34 MB
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.merge(c, -1, Integer::sum);
                map.remove(c, 0);
            }
        }
        return map.isEmpty();
    }
}
