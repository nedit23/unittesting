package sele.rz;

/**
 * Unit test for simple App.
 */


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testEvenNumber() {
        int num = 10;
        assertEquals(0, num % 2);
    }

    @Test
    public void testOddNumber() {
        int num = 7;
        assertEquals(1, num % 2);
    }

    @Test
    public void testZero() {
        int num = 0;
        assertEquals(0, num % 2);
    }
}