package kata.kyu05;

/**
 * Weight for weight
 */

import java.util.Arrays;

public class WeightSort {

    public static String orderWeight(String strng) {
        String[] numbers = strng.split(" ");

        Arrays.sort(numbers, (o1, o2) -> {
            int value1 = o1.chars().map(Character::getNumericValue).sum();
            int value2 = o2.chars().map(Character::getNumericValue).sum();
            return value1 - value2 == 0 ? o1.compareTo(o2) : value1 - value2;
        });

        return String.join(" ", numbers);
    }
}

