package kata.kyu06;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        return search(array1, array2).stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    private static List<String> search(String[] array1, String[] array2) {

        List<String> stringList = new ArrayList<>();

        for (String value : array1) {
            for (String array : array2) {
                if (array.contains(value)) {
                    stringList.add(value);
                }
            }
        }

        return stringList;
    }

}
