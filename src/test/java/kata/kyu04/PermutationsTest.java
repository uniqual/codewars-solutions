package kata.kyu04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsTest {

    @Test
    void example1() {
        assertEquals(new ArrayList<>(List.of("a")),
                Permutations.singlePermutations("a")
                        .stream()
                        .sorted()
                        .collect(Collectors.toList()));
    }

    @Test
    void example2() {
        assertEquals(new ArrayList<>(List.of("ab", "ba")),
                Permutations.singlePermutations("ab")
                        .stream()
                        .sorted()
                        .collect(Collectors.toList()));
    }

    @Test
    void example3() {
        assertEquals(new ArrayList<>(List.of("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb")
                        .stream()
                        .sorted()
                        .collect(Collectors.toList()));
    }

}