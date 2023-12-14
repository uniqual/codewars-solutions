package kata.kyu05;

import java.util.Arrays;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        boolean isScramble = false;
        int step = 0;

        char[] str1chars = str1.toCharArray();
        char[] str2chars = str2.toCharArray();

        Arrays.sort(str1chars);
        Arrays.sort(str2chars);

        for (int i = 0; i < str2chars.length; i++) {
            isScramble = false;
            for (int j = step; j < str1chars.length; j++) {
                if (str2chars[i] == str1chars[j]) {
                    step = j + 1;
                    isScramble = true;
                    break;
                }
            }
            if (!isScramble) break;
        }

        return isScramble;
    }
}
