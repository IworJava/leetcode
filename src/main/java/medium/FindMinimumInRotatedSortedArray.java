package medium;

public class FindMinimumInRotatedSortedArray {

    /**
     * 0 ms, 40.63 MB
     */
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = nums[l];

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[l]) {
                min = Math.min(min, nums[mid]);
                r = mid - 1;
            } else {
                min = Math.min(min, nums[l]);
                l = mid + 1;
            }
        }
        return min;
    }
}
