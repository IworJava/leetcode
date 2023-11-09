package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionLabelsTest {

    private final PartitionLabels obj = new PartitionLabels();

    @Test
    void shouldReturnCorrectResult() {
        String s = "ababcbacadefegdehijhklijz";
        List<Integer> expected = List.of(9, 7, 8, 1);

        List<Integer> actual = obj.partitionLabels(s);

        assertEquals(expected, actual);
    }
}