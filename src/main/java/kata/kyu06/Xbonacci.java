package kata.kyu06;

// Fibonacci, Tribonacci and friends

public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {

        double[] xbonacci = new double[n];

        for (int i = 0; i < signature.length && i < n; i++) {
            xbonacci[i] = signature[i];
        }

        for (int i = signature.length; i < xbonacci.length; i++) {
            for (int j = 1; j <= signature.length; j++) {
                xbonacci[i] += xbonacci[i - j];
            }
        }
        return xbonacci;
    }
}
