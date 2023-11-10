package medium;

public class LongestRepeatingCharacterReplacement {

    /**
     * 8 ms, 41.41 MB
     */
    public int characterReplacement(String s, int k) {
        int l = 0;
        int[] count = new int[26];
        int maxCount = 0;
        int result = 0;

        for (int r = 0; r < s.length(); r++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(r) - 'A']);

            if ((r - l + 1) - maxCount > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }

    /**
     * 4 ms, 41.80 MB
     */
    public int characterReplacement1(String s, int k) {
        int l = 0;
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        int maxCount = 0;
        int result = 0;
        int temp = 0;

        for (int r = 0; r < s.length(); r++) {
            temp = ++count[chars[r] - 'A'];
            if (temp > maxCount) {
                maxCount = temp;
            }
            if ((r - l + 1) - maxCount > k) {
                count[chars[l] - 'A']--;
                l++;
            }
            temp = r - l + 1;
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
