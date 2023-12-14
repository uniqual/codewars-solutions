package kata.kyu05;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/solutions/java">...</a>
 */

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() < (part1.concat(part2).length())) {
            return false;
        }

        Queue<Character> partOneQueue = transformStringToQueue(part1);
        Queue<Character> partTwoQueue = transformStringToQueue(part2);
        List<Character> intersections = new ArrayList<>();

        for (var ch : s.toCharArray()) {
            Character currentChar = ch;
            if (currentChar.equals(partOneQueue.peek()) && currentChar.equals(partTwoQueue.peek())) {
                partOneQueue.poll();
                partTwoQueue.poll();
                intersections.add(currentChar);
            } else if (currentChar.equals(partOneQueue.peek())) {
                partOneQueue.poll();
            } else if (currentChar.equals(partTwoQueue.peek())) {
                partTwoQueue.poll();
            } else if (intersections.contains(ch)) {
                intersections.remove(Character.valueOf(ch));
            } else {
                return false;
            }
        }
        return true;
    }

    private static Queue<Character> transformStringToQueue(String part) {
        Queue<Character> queue = new LinkedList<>();
        for (var ch : part.toCharArray()) {
            queue.add(ch);
        }
        return queue;
    }
}


