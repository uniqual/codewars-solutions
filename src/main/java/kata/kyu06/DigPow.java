package kata.kyu06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigPow {

    public static long digPow(int n, int p) {

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int add = 0;
        int divider = n;

        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(list);

        for (int number : list) {
            sum += Math.pow(number, p + add);
            add++;
        }

        long result = sum / divider;

        if (divider * result != sum) {
            return -1;
        }

        return result;
    }
}