package medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

    /**
     * 11 ms, 43.52 MB
     */
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator
                .comparing(map::get, Comparator.reverseOrder())
                .thenComparing(a -> ((String) a)));

        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        queue.addAll(map.keySet());
        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }

    /**
     * 6 ms, 43.53 MB
     */
    public List<String> topKFrequent1(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(
                (a, b) -> map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a)
        );

        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        queue.addAll(map.keySet());
        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
}
