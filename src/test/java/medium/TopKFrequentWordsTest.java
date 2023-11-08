package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentWordsTest {

    private final TopKFrequentWords obj = new TopKFrequentWords();

    @Test
    void topKFrequent() {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> expected = List.of("i", "love");

        List<String> actual = obj.topKFrequent(words, k);
        List<String> actual1 = obj.topKFrequent1(words, k);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}