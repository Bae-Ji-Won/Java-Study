package Date10_27.Algorithm;

import java.util.HashMap;
import java.util.Map;

/* 프로그래머스 완주하지 못한 선수 문제
 1. 배열로 참가인원 명단 받음
 2. 완주자 명단 배열로 받음
 3. 참가인원 명단에서 완주자명단을 제외한 명단을 리턴해줌
 */
public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];        // key에는 participant배열의 값을 넣음

            if (!memo.containsKey(key)) {     // 동명이인 구분을 위해 이미 같은 이름의 키가 존재하지 않다면
                memo.put(key, 0);            // [key,0] 대입
            }

            memo.put(key, memo.get(key) + 1);
            // 명단이 들어간 자리에는 +1의 값을 넣어줌
            // 즉, 새로 생긴 값이라면 0+1 , 동명이인이라 이미 있는 값이라면 1+1
            // ex) {"홍길동","이순신","홍길동"} 배열 대입
            // ["홍길동",2] ,["이순신",1]
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1);      // key의 값에서 -1을 한다.
            // {"홍길동","이순신"} 이라면
            // ["홍길동",1] ,["이순신",0]
        }

        String person = null;

        for (String key : memo.keySet()) {
            if (memo.get(key) == 1)
                person = key;
        }
        return person;
    }
}
