package prepare.algorithms.implementation;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberLineJumpsTest {
    @Test
    public void testKangaroo() {
        assertEquals("YES", NumberLineJumps.kangaroo(0, 3, 4, 2));

        assertEquals("NO", NumberLineJumps.kangaroo(0, 2, 5, 4));

        assertEquals("NO", NumberLineJumps.kangaroo(0, 2, 5, 3));

        assertEquals("YES", NumberLineJumps.kangaroo(0, 5, 10, 3));

        assertEquals("YES", NumberLineJumps.kangaroo(0, 10000, 10000, 9999));

        assertEquals("NO", NumberLineJumps.kangaroo(0, 9999, 10000, 10000));
    }
}