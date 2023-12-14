/**
 * In this kata you have to create all permutations of a non-empty input string and remove duplicates, if present.
 * This means, you have to shuffle all letters from the input in all possible orders.
 *
 * Link - https://www.codewars.com/kata/5254ca2719453dcc0b00027d/train/java
 */

package kata.kyu04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> set = new TreeSet<>();
        generatePermutation(set, s, 0, s.length());
        return new ArrayList<>(set);
    }

    public static void generatePermutation(Set<String> set, String str, int start, int end) {
        if (start == end - 1) {
            set.add(str);
        }
        else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutation(set, str, start + 1, end);
                str = swapString(str, start, i);
            }
        }
    }

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
}
