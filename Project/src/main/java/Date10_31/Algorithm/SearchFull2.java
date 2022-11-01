package Date10_31.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchFull2 {
    public int[] solution(int[] answers) {
        String answerPattern1 = "12345".repeat(2000);
        String answerPattern2 = "21232425".repeat(1250);
        String answerPattern3 = "3311224455".repeat(1000);

        // 공간복잡도로 속도를 높이는 방법
        int[] count = {0,0,0};

        // 각 사람마다 작성한 답안지를 채점함
        // 답이 맞으면 결과 배열의 값을 1씩 증가함
        for (int i = 0; i < answers.length; i++) {
            if(Character.getNumericValue(answerPattern1.charAt(i)) == answers[i]) count[0] ++;
            if(Character.getNumericValue(answerPattern2.charAt(i)) == answers[i]) count[1] ++;
            if(Character.getNumericValue(answerPattern3.charAt(i)) == answers[i]) count[2] ++;
        }

        // 중복 검사
        List<Integer> maxscorelist = new ArrayList<>();
        int maxscore = Math.max(count[0],Math.max(count[1], count[2]));

        for(int i=0; i<count.length; i++){
           if(maxscore == count[i]){           // 최대값이 count배열의 안에 있는 값과 같을시
               maxscorelist.add(i+1);     // list에 i번째의 자리를 넣어야 하는데 배열은 0부터 시작이므로 +1하여 넣는다
           }
        }

        // list -> int[]
        int[] result = maxscorelist.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return result;
    }
}
