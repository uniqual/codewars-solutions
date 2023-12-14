package kata.kyu06;

// CamelCase Method

public class Solution {
    public static String camelCase(String str) {

        String[] stringArray = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String string : stringArray) {
            if (string.length() > 0)
                sb.append(string.substring(0, 1).toUpperCase()).append(string.substring(1));
        }
        return sb.toString();
    }
}

