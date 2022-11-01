package Date10_31.Algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;



class SearchFull2Test {

    @Test
    @DisplayName("제일많이 맞춘사람 1명일때")
    void onecheck(){
        SearchFull2 sf = new SearchFull2();

        int[] answers = {1,2,3,4,5};

        assertEquals("[1]",Arrays.toString(sf.solution(answers)));
    }

    @Test
    @DisplayName("제일많이 맞춘사람 1명 이상 일때")
    void twocheck(){
        SearchFull2 sf = new SearchFull2();

        int[] answers2 = {1,3,2,4,2};

        assertEquals("[1, 2, 3]",Arrays.toString(sf.solution(answers2)));
    }
}