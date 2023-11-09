package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

    /**
     * 44 ms, 47.69 MB
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>(
                (a, b) -> count.get(b) - count.get(a));

        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }
        queue.addAll(count.keySet());
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
