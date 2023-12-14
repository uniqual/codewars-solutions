package kata.kyu06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigPowTest {
    @Test
    void test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    void test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    void test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}