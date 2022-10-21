package Date10_21.Algorithm;

// 알고리즘 스택 괄호
// 스택사용하지 않고 풀어보기
// 프로그래머스 올바른 괄호문제
public class bracket {
    public boolean result(String s){
        while(s.indexOf("()") >= 0){            // ()를 문자열에서 index 값을 찾음
                                            // 만약 인덱스 값이 0보다 크면
            s = s.replace("()","");     // ()를 ""으로 바꿈
                                                    // 예시. (()) 일때 () = index 1이므로 while문 동작
                                                    // "" 자리 바꿔서 () 출력후 다시 반복
        }

        return s.length()==0;           // s 문자열의 길이가 0이면 ()가 짝수 이므로 True 반환
    }
}
