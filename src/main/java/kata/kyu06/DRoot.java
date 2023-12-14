package kata.kyu06;

/**
 * @link https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
 */

public class DRoot {

    public static int digitalRoot(int n) {
        int sum;
        do {
            sum = 0;
            while (n > 0) {
                sum = sum + (n % 10);
                n = n / 10;
            }
            n = sum;
        } while (sum > 10);

        return sum;
    }
}
