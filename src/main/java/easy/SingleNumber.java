package easy;

import java.util.HashSet;

public class SingleNumber {

    /**
     * 11 ms, 43.32 MB
     */
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return (int) set.toArray()[0];
    }
}
