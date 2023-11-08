package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    /**
     * 8 ms, 45.62 MB
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);  // faster than Comparator.comparingInt(a -> a[0])

        for (int[] arr : intervals) {
            int last = list.size() - 1;
            if (list.isEmpty() || list.get(last)[1] < arr[0]) {
                list.add(arr);
            } else {
                list.get(last)[1] = Math.max(list.get(last)[1], arr[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
