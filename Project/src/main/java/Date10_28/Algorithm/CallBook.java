package Date10_28.Algorithm;

import java.util.HashSet;
import java.util.Set;

/* 프로그래머스 해시-전화번호 목록
    1. 전화번호가 적인 값을 배열로 받음
    2. 각 자리에 있는 전화번호가 다른 전화번호의 접두어인지 판별
    3. 결과 출력
 */
public class CallBook {
    public Boolean solution(String[] phone_book){
        Set<String> set= new HashSet<>();

        for(String phone : phone_book)
            set.add(phone);         // HashSet에 저장

        for(int i=0; i<set.size(); i++){        // startWith() 메서드를 사용해서 비교할 수도 있음
            for(int j =0; j< phone_book[i].length(); j++){
                if(set.contains(phone_book[i].substring(0,j)))      
                    return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        CallBook cb = new CallBook();
        Boolean result1 =  cb.solution(new String[]{"119","97674223","1195524421"});
        Boolean result2 =  cb.solution(new String[]{"123","456","789"});
        Boolean result3 =  cb.solution(new String[]{"12","123","1235","567","88"});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
