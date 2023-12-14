package kata.kyu06;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java/5c96aebcea6c15001914d83b
 */

public class HighestScoringWord {
    public static String high(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String[] string = s.split(" ");

        for (int i = 0; i < alphabet.length(); i++) {
            map.put(alphabet.charAt(i),  i + 1);
        }

        int longestString = 0;
        String strToReturn = "";

        for (int i = 0; i < string.length; i++) {
            int stringCounter = 0;
            char[] chars = string[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (map.containsKey(string[i].charAt(j))) {
                    stringCounter = stringCounter + map.get(chars[j]);
                }
            }
            if (stringCounter > longestString) {
                longestString = stringCounter;
                strToReturn = string[i];
            }
        }
        return strToReturn;
    }
}
