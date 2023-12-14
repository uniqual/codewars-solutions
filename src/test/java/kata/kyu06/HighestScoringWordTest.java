package kata.kyu06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestScoringWordTest {

    @Test
    void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }
}