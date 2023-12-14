package kata.kyu06;

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java/5c90ea239dd78135a47fe79c"></a>
 */

public class DuplicateEncoder {
    static String encode(String word) {

        char[] chars = word.toLowerCase().toCharArray();

        Map<Character, Character> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c)) {
                map.put(c, ')');
            } else {
                map.put(c, '(');
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char aChar : chars) {
            for (char ch : map.keySet()) {
                if (aChar == ch) {
                    stringBuilder.append(map.get(ch));
                }
            }
        }
        return stringBuilder.toString();
    }
}