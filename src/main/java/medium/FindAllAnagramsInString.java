package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {

    /**
     * 2471 ms, 45.4 MB
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            target.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            map.clear();

            for (int j = 0; j < p.length(); j++) {
                if (!target.containsKey(s.charAt(i + j))) {
                    i += j;
                    break;
                }
                map.merge(s.charAt(i + j), 1, Integer::sum);

                if (j == (p.length() - 1) && target.equals(map)) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
