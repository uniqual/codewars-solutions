package kata.kyu05;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://www.codewars.com/kata/550f22f4d758534c1100025a"></a>
 */

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        Deque<String> deque = new ArrayDeque<>();

        for (String direction : arr) {
            switch (direction) {
                case "NORTH" -> {
                    if (!deque.isEmpty() && "SOUTH".equals(deque.peekLast())) deque.pollLast();
                    else deque.add(direction);
                }
                case "SOUTH" -> {
                    if (!deque.isEmpty() && "NORTH".equals(deque.peekLast())) deque.pollLast();
                    else deque.add(direction);
                }
                case "WEST" -> {
                    if (!deque.isEmpty() && "EAST".equals(deque.peekLast())) deque.pollLast();
                    else deque.add(direction);
                }
                case "EAST" -> {
                    if (!deque.isEmpty() && "WEST".equals(deque.peekLast())) deque.pollLast();
                    else deque.add(direction);
                    }
            }
        }
        return deque.toArray(new String[0]);
    }
}
