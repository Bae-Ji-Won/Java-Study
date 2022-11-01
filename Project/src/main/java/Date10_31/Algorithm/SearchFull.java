package Date10_31.Algorithm;

/*  프로그래머스 완전탐색-모의고사

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

위와 같이 서로 다른 방식으로 문제의 답을 찍어나갈때 3명의 학생중 누가 가장 많이 맞추는지 알아내라
 */

import java.util.*;

public class SearchFull {
    public int[] solution(int[] answers) {

        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};

        int[] temp = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == user1[i%user1.length])
                temp[0]++;
            if(answers[i] == user2[i%user2.length])
                temp[1]++;
            if(answers[i] == user3[i%user3.length])
                temp[2]++;
        }

        int max = Math.max(temp[0], Math.max(temp[1],temp[2])); // 3개의 값 중 최대값 저장
        List<Integer> maxScore = new ArrayList<>();
        // 최대값이 중복일 경우 리스트에 추가해줌
        for(int i=0; i<temp.length; i++){
            if(max == temp[i])
                maxScore.add(i+1);
        }

        // List => Arrays
        int[] result = new int[maxScore.size()];
        for(int i =0; i<maxScore.size(); i++){
            result[i] = maxScore.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        SearchFull sf = new SearchFull();

        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        System.out.println(Arrays.toString(sf.solution(answers)));
        System.out.println(Arrays.toString(sf.solution(answers2)));
    }
}
