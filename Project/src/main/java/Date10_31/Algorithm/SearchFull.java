package Date10_31.Algorithm;

/*  프로그래머스 완전탐색-모의고사

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

위와 같이 서로 다른 방식으로 문제의 답을 찍어나갈때 3명의 학생중 누가 가장 많이 맞추는지 알아내라
 */

public class SearchFull {
    public int solution(int[] answers) {
        int[] user1 = {1,2,3,4,5};

        int firststudent = 0;

        for(int i=0; i<answers.length; i++){
            if(user1[i] == answers[i]){
                firststudent++;
            }
        }


        return firststudent;
    }

    public static void main(String[] args) {
        SearchFull sf = new SearchFull();

        int[] result = {1,2,3,4,5};
        System.out.println(sf.solution(result));
    }
}
