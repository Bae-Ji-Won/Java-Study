package Date10_27.Algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 프로그래머스 완주하지 못한 선수 문제
 1. 배열로 참가인원 명단 받음
 2. 완주자 명단 배열로 받음
 3. 참가인원 명단에서 완주자명단을 제외한 명단을 리턴해줌
 */
public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> memo = new HashMap<>();

        for(int i=0; i<participant.length; i++){
            String key = participant[i];        // key에는 participant배열의 값을 넣음
            memo.put(key,1);            // 명단이 들어간 자리에는 1의 값을 넣어줌
                                        // ex) {"홍길동","이순신"} 배열 대입
                                        // ["홍길동",1] ,["이순신",1]
        }

        for(int i=0; i<completion.length; i++){
            String key = completion[i];
            if(memo.get(key) == 1){        // 입력받은 키의 값이 1일때
                memo.remove(key);           // 키의 데이터를 map에서 삭제한다
            }
        }

        Iterator<String> iterator = memo.keySet().iterator();
        String key = null;

        while(iterator.hasNext()){
            key = iterator.next();
        }

        return key;
    }
}
