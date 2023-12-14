package kata.kyu06;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XbonacciTest {

    @Test
    void basicTests() {
        assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, Xbonacci.xbonacci(new double []{0,1},10));
        assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, Xbonacci.xbonacci(new double []{1,1},10));
        assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, Xbonacci.xbonacci(new double []{0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, Xbonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }

}
