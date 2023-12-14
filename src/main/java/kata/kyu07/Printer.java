package kata.kyu07;

// Printer Errors

public class Printer {
    public static String printerError(String s) {

        int length = s.length();
        int errorsOccurred = 0;
        s = s.toLowerCase();
        char ch = 'm';

        for (char c : s.toCharArray()) {
            if (c > ch) {
                errorsOccurred++;
            }
        }

        return errorsOccurred + "/" + length;
    }
}
