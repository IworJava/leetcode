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

    /**
     * 68 ms, 44.65 MB
     */
    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pl = p.length();
        if (s.length() < pl) {
            return result;
        }

        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {
            target.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < pl - 1; i++) {
            map.merge(s.charAt(s.length() - i - 1), 1, Integer::sum);
        }

        for (int i = s.length() - pl; i >= 0; i--) {
            map.merge(s.charAt(i), 1, Integer::sum);
            if (map.equals(target)) {
                result.add(i);
            }
            int count = map.get(s.charAt(i + pl - 1));
            if (count == 1) {
                map.remove(s.charAt(i + pl - 1));
            } else {
                map.put(s.charAt(i + pl - 1), count - 1);
            }
        }
        return result;
    }

    /**
     * 8 ms, 43.83 MB
     */
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pl = p.length();

        if (s.length() < pl) {
            return result;
        }

        int[] pa = getArr(p);
        char[] sa = s.toCharArray();
        int[] check = getArr(s.substring(0, pl - 1));

        for (int i = 0; i < sa.length - pl + 1; i++) {
            check[sa[i + pl - 1] - 'a']++;
            if (equals(pa, check)) {
                result.add(i);
            }
            check[sa[i] - 'a']--;
        }
        return result;
    }

    private int[] getArr(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        return arr;
    }

    private boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
