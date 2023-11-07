package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    /**
     * 6 ms, 46.58 MB
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            map.merge(newStr, new ArrayList<>(List.of(str)), (a, b) -> {
                a.addAll(b);
                return a;
            });
        }
        return new ArrayList<>(map.values());
    }
}
