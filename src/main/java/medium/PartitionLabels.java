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
}
