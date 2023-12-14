package kata.kyu05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringMergerTest {

    @Test
    void normalHappyFlow() {
        assertTrue(StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse(StringMerger.isMerge("codewars", "cod", "wars"));
        assertTrue(StringMerger.isMerge("n*YIQbIZO3 O_.xve@-O(w  VQr@8N7?.R/nv y^'v_gMVsUn*YIQbIZO3 O_.xve@-O(taL!vza\"s7K@w*c^YdkQAm5`]!kJhtY6A:9Q?fe+(",
                "n*YIQbIZO3 O_.xve@-O(taL!vza\"s7K@w*c^Y",
                "n*YIQbIZO3 O_.xve@-O(w  VQr@8N7?.R/nv y^'v_gMVsUdkQAm5`]!kJhtY6A:9Q?fe+("));
        assertTrue(StringMerger.isMerge("Can we merge it? Yes, we can!", "Ca wemrge? Yes,wean!", "n e it  c"));
    }

}
