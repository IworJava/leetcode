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

    /**
     * 1 ms, 44.46 MB
     */
    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] abc = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            abc[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (abc[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            abc[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
