package Date10_27.Algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnfinishedPlayerTest {

    @Test
    @DisplayName("명단, 완주명단 입력")
    void runner(){
        UnfinishedPlayer up = new UnfinishedPlayer();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = up.solution(participant,completion);

        Assertions.assertEquals("mislav",result);
    }
}