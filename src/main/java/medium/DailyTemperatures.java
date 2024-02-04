package medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to
 * wait after the ith day to get a warmer temperature. If there is no future day
 * for which this is possible, keep answer[i] == 0 instead.
 * temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 */
public class DailyTemperatures {

    /**
     * 23 ms, 60.03 MB
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!deque.isEmpty() && temperatures[deque.peekFirst()] <= temperatures[i]) {
                deque.removeFirst();
            }
            result[i] = deque.isEmpty() ? 0 : deque.peekFirst() - i;
            deque.addFirst(i);
        }
        return result;
    }
}
