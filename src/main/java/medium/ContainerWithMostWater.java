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

    private int area(int[] height, int left, int right) {
        return (right - left) * Math.min(height[left], height[right]);
    }
}
