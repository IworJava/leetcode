package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || Arrays.equals(strs, new String[0])) {
            return "";
        }
        var result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (result.isEmpty()) {
                return "";
            }
            for (int j = 0; j < result.length(); j++) {
                if (strs[i].length() == j || result.charAt(j) != strs[i].charAt(j)) {
                    result = result.substring(0, j);
                    break;
                }
            }
        }
        return result;
    }
}
