package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    private final GroupAnagrams obj = new GroupAnagrams();

    @Test
    void shouldReturnAllAnagrams() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = List.of(
                List.of("eat", "tea", "ate"),
                List.of("bat"),
                List.of("tan", "nat")
        );

        List<List<String>> actual = obj.groupAnagrams(strs);

        assertEquals(expected.size(), actual.size());
    }

    @Test
    void shouldReturnEmptyList() {
        String[] strs = {};
        List<List<String>> expected = new ArrayList<>();

        List<List<String>> actual = obj.groupAnagrams(strs);

        assertEquals(expected, actual);
    }
}