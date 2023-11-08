package medium;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllAnagramsInStringTest {

    private final FindAllAnagramsInString obj = new FindAllAnagramsInString();

    @Test
    void shouldReturnValidAnagrams() {
        String str = "abab";
        String target = "ab";
        List<Integer> expected = List.of(0, 1, 2);

        List<Integer> actual = obj.findAnagrams(str, target);
        List<Integer> actual1 = obj.findAnagrams1(str, target);

        actual.sort(Comparator.naturalOrder());
        actual1.sort(Comparator.naturalOrder());

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }

    @Test
    void shouldReturnEmptyList() {
        String str = "abab";
        String target = "ac";
        List<Integer> expected = List.of();

        List<Integer> actual = obj.findAnagrams(str, target);
        List<Integer> actual1 = obj.findAnagrams1(str, target);

        actual.sort(Comparator.naturalOrder());
        actual1.sort(Comparator.naturalOrder());

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1)
        );
    }
}
