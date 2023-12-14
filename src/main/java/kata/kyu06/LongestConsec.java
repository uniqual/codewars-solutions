package kata.kyu06;

// Consecutive strings

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {

        if ((k > strarr.length) || (k <= 0) || (strarr.length == 0)) {
            return "";
        }

        String longestString = "";

        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder concat = new StringBuilder();
            for (int j = i; j < i+k; j++) {
                concat.append(strarr[j]);
             }
            if (concat.length() > longestString.length()) {
                longestString = concat.toString();
            }
        }
        return longestString;
    }
}
