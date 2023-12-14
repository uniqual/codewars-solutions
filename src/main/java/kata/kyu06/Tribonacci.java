package kata.kyu06;

// Tribonacci Sequence

public class Tribonacci {
    public static double[] tribonacci(double[] s, int n) {

        if (n == 0) {
            return new double[]{};
        }
        double[] tribonacci = new double[n];

        for (int i = 0; i < s.length && i < n; i++) {
            tribonacci[i] = s[i];
        }

        for (int i = s.length; i < n; i++) {
            tribonacci[i] = tribonacci[i-1] + tribonacci[i-2] + tribonacci[i-3];
        }
        return tribonacci;
    }
}
