package Date10_21.Algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){
        bracket sb = new bracket();
        assertFalse(sb.result("()())"));
        assertFalse(sb.result(")()()("));
        assertTrue(sb.result("()()"));
        assertTrue(sb.result("((()()))"));
        assertTrue(sb.result("((((((((((()))))))))))"));
        assertFalse(sb.result("(()("));
    }
}