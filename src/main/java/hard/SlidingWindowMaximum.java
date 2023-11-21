package hard;

import java.util.TreeMap;

public class SlidingWindowMaximum {

    /**
     * 282 ms, 59.97 MB
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            map.merge(nums[r], 1, Integer::sum);

            if (r - l + 1 < k) {
                continue;
            }
            result[l] = map.lastKey();
            map.merge(nums[l], -1, Integer::sum);
            map.remove(nums[l], 0);
            l++;
        }
        return result;
    }
}
