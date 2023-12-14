package kata.kyu07;

public class Palindrome {
    public static long palindromeChainLength(long n) {
        int steps = 0;
        while (n != reverseNumber(n)) {
            n = n + reverseNumber(n);
            steps++;
        }
        return steps;
    }

    private static long reverseNumber(long number) {
        long reverse = 0;
        while (number > 0) {
            long digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}
