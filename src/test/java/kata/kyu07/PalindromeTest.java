package kata.kyu07;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testPalindrome() {
        assertEquals(0, Palindrome.palindromeChainLength(1));
        assertEquals(0, Palindrome.palindromeChainLength(88));
        assertEquals(0, Palindrome.palindromeChainLength(393));
    }

    @Test
    void testNonPalindrome() {
        assertEquals(1, Palindrome.palindromeChainLength(10));
        assertEquals(1, Palindrome.palindromeChainLength(134));
        assertEquals(4, Palindrome.palindromeChainLength(87));
        assertEquals(7, Palindrome.palindromeChainLength(2897));
        assertEquals(24, Palindrome.palindromeChainLength(89));
    }
}