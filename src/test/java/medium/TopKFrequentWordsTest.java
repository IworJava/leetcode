package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentWordsTest {

    private final TopKFrequentWords obj = new TopKFrequentWords();

    @Test
    void topKFrequent() {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> expected = List.of("i", "love");

        List<String> actual = obj.topKFrequent(words, k);

        assertEquals(expected, actual);
    }
}