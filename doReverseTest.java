
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class doReverseTest {
    @Test
    void testDoReverse() {
        assertEquals("ttle", Checker.doReverse("eltt"));
        assertEquals("big", Checker.doReverse("gib"));
        assertEquals("kkke", Checker.doReverse("ekkk"));
        assertEquals("sus pense", Checker.doReverse("esnep sus"));
    }
}
