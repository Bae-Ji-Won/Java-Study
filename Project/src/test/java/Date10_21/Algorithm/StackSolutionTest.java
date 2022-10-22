package Date10_21.Algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackSolutionTest {

    @Test
    @DisplayName("괄호 구분")
    void bracket(){
        StackSolution s = new StackSolution();
        assertTrue(s.solution("{}()[](({}))"));
        assertFalse(s.solution("{}()[](({))"));
    }
}