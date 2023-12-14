package kata.kyu05;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ScrambliesTest {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("rkqodlw","world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scramblies.scramble("katas","steak"),false);
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
        testing(Scramblies.scramble("scriptingjava","javascript"),true);
        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
        testing(Scramblies.scramble("javscripts","javascript"),false);
        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scramblies.scramble("commas","commas"),true);
        testing(Scramblies.scramble("sammoc","commas"),true);
    }

    @Test
    void test1() {
        char[] ch = "world".toCharArray();
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        char[] ch1 = "rkqodlw".toCharArray();
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));
    }
}