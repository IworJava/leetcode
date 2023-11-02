package easy;

import java.util.HashSet;

public class SingleNumber {

    /**
     * 1 ms, 44.5 MB (?)
     */
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        return x;
    }

    /**
     * 11 ms, 43.32 MB
     */
    public int singleNumber1(int[] nums) {
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
