package kata.kyu05;

// Josephus Permutation

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        List<T> people = new ArrayList<>();
        List<Integer> killedOrder = new ArrayList<>();

        int count = 0;

        while ((killedOrder.size() != items.size())) {
            for (int i = 0; i < items.size(); i++) {
                if (!(killedOrder.contains(i))) {
                    count++;
                    if ((count == k)) {
                        killedOrder.add(i);
                        count = 0;
                    }
                }
            }
        }

        for (int index : killedOrder) {
            people.add(items.get(index));
        }
        return people;
    }
}