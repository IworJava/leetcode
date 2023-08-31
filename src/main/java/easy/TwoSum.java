package easy;

import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum1(int[] nums, int target) {
        var set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int couple = target - nums[i];
            if (set.contains(couple)) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == couple) {
                        return new int[]{j, i};
                    }
                }
            } else {
                set.add(nums[i]);
            }
        }
        return new int[0];
    }
}
