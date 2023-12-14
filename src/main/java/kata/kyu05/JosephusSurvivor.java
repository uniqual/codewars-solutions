package kata.kyu05;

// Josephus Survivor

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        int survivor;

        while (people.size() > 1) {
            index = index + k - 1;
            index = index % people.size();
            people.remove(index);
        }
        survivor = people.get(0);
        return survivor;
    }
}
