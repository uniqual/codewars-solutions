package kata.kyu06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DRootTest {
    @Test
    void Test1() {
        assertEquals(7, DRoot.digitalRoot(16));
    }
    @Test
    void Test2() {
        assertEquals(6, DRoot.digitalRoot(456));
    }
}