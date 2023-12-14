package kata.kyu06;

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        int time = 0;

        if (walk.length != 10)
            return false;

        Map<Character, Integer> directions = new HashMap<>();
        directions.put('n', 1);
        directions.put('s', -1);
        directions.put('w', 1);
        directions.put('e', -1);

        for (char c : walk)
            time = time + directions.get(c);

        return time == 0;
    }
}
