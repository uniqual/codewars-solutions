package kata.kyu05;

public class ProdFib {

    public static long[] productFib(long prod) {
        // your code
        long var1 = 0;
        long var2 = 1;
        long[] result = new long[3];

        for (int i = 0; i <= prod; i++) {
            long sum = var1 + var2;
            var1 = var2;
            var2 = sum;
            if (var1 * var2 == prod) {
                result = new long[] {var1, var2, 1};
                break;
            } else if (var1 * var2 > prod) {
                result =  new long[] {var1, var2, 0};
                break;
            }
        }
        return result;
    }
}
