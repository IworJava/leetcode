package medium;

public class ContainerWithMostWater {

    /**
     * 4 ms, 55.16 MB
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = area(height, left, right);

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            max = Math.max(max, area(height, left, right));
        }
        return max;
    }

    /**
     * 2 ms, 55.46 MB
     */
    public int maxArea1(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lv = height[l];
        int rv = height[r];
        int max = area(height, l, r);

        while (l < r) {
            if (lv < rv) {
                l++;
                if (lv < height[l]) {
                    lv = height[l];
                    max = Math.max(max, area(height, l, r));
                }
            } else {
                r--;
                if (rv < height[r]) {
                    rv = height[r];
                    max = Math.max(max, area(height, l, r));
                }
            }
        }
        return max;
    }

    private int area(int[] height, int left, int right) {
        return (right - left) * Math.min(height[left], height[right]);
    }
}
