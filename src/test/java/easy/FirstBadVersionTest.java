package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {


    @Test
    void firstBadVersion() {
        int n = 3;
        int n1 = 1;
        int expected = 1;
        int expected2 = 2;
        FirstBadVersion obj = new FirstBadVersion(expected);
        FirstBadVersion obj2 = new FirstBadVersion(expected2);

        int actual = obj.firstBadVersion(n);
        int actual1 = obj.firstBadVersion(n1);
        int actual2 = obj2.firstBadVersion(n);

        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected, actual1),
                () -> assertEquals(expected2, actual2)
        );
    }
}