package kata.kyu05;

/**
 * Find the smallest (5 kyu)
 * https://www.codewars.com/kata/573992c724fc289553000e95/train/java
 */

public class FindTheSmallest {

    public static long[] smallest(long n) {
        String number = String.valueOf(n);
        long smallest = n;

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            for (int j = 0; j < number.length(); j++) {
                if (i == j) continue;
                StringBuilder changing = new StringBuilder(number);
                changing.deleteCharAt(i);
                changing.insert(j, digit);

                long changedNumber = Long.parseLong(changing.toString());

                if (changedNumber < smallest) {
                    smallest = changedNumber;
                    index1 = i;
                    index2 = j;
                }
            }
        }

        return new long[] {smallest, index1, index2};
    }
}