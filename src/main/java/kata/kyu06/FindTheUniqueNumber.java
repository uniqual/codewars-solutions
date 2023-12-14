package kata.kyu06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        Map<Double, Integer> elements = new HashMap<>();

        for (double number : arr) {
            if (elements.containsKey(number)) {
                elements.put(number, elements.get(number) + 1);
            } else {
                elements.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> map : elements.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }
        }

        return 0.0;
    }

    public static double solutionTwo(double [] arr) {
        return Arrays.stream(arr).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0.0);
    }
}
