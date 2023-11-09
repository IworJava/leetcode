package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    /**
     * 17 ms, 43.74 MB
     */
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int r = s.length() - 1;
        Map<Character, Integer> map = new HashMap<>();

        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            while (cl != cr) {
                map.merge(cr, r, (a, b) -> a);
                r--;
                cr = s.charAt(r);
            }
            for (int i = l; i < r; i++) {
                if (map.containsKey(s.charAt(i))) {
                    r = Math.max(r, map.get(s.charAt(i)));
                }
            }
            result.add(r - l + 1);
            l = r + 1;
            r = s.length() - 1;
        }
        return result;
    }

    /**
     * 8 ms, 41.10 MB
     */
    public List<Integer> partitionLabels1(String s) {
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            char cl = s.charAt(l);
            r = s.lastIndexOf(cl);
            for (int i = l; i < r; i++) {
                r = Math.max(r, s.lastIndexOf(s.charAt(i)));
            }
            result.add(r - l + 1);
            l = r + 1;
            r = s.length() - 1;
        }
        return result;
    }

    /**
     * 8 ms, 41.66 MB
     */
    public List<Integer> partitionLabels2(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> letters = new HashMap<>();
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            letters.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, letters.get(s.charAt(i)));
            if (max == i) {
                result.add(max - min + 1);
                min = max + 1;
            }
        }
        return result;
    }

    /**
     * 5 ms, 40.78 MB
     */
    public List<Integer> partitionLabels3(String s) {
        List<Integer> result = new ArrayList<>();
        int[] letters = new int[26];
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, letters[s.charAt(i) - 'a']);
            if (max == i) {
                result.add(max - min + 1);
                min = max + 1;
            }
        }
        return result;
    }
}
