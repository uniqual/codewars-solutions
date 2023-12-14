package kata.kyu05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

 class SumOfKTest {

    @Test
    void basicTest0() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 57, 58, 60));
        int n = SumOfK.chooseBestSum(174, 3, ts);
        assertEquals(173, n);
    }

    @Test
    void BasicTests1() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        int n = SumOfK.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
    }


    @Test
    void basicTest2() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50));
        Integer m = SumOfK.chooseBestSum(163, 3, ts);
        assertNull(m);
    }

    @Test
    void basicTest3() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        int n = SumOfK.chooseBestSum(230, 3, ts);
        assertEquals(228, n);
    }

    @Test
    void basicTest4() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(91, 87, 85, 81, 74, 73, 73));
        int n = SumOfK.chooseBestSum(331, 2, ts);
        assertEquals(178, n);
    }

    @Test
    void basicTest5() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
        int n = SumOfK.chooseBestSum(230, 4, ts);
        assertEquals(230, n);
    }
}