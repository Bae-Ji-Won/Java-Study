package Date11_18.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 프로그래머스 시저암호(내 방식대로 풀기)
    시저암호 : 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
    예) "AB"는 1만큼 밀면 "BC가 되고, 3만큼 밀면 "DE"가 된다. "z'는 1만큼 밀면 "a"가 된다.

    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수를 작성하라.

--------  제한조건  --------
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.
 */
class CaesarPassword {

    public char solution(char c, int num){
        if((int)c >= 97 && (int)c <= 122) {   // 소문자 일때
            int result = c+num;
            if(result >122){
                result -= 122;
                return (char)((96+result));
            }
            return (char) ((c + num));
        }
        else if((int)c>=65 && (int)c<=90) {   // 대문자 일때
            int result = c+num;
            if(result >90){
                result -= 90;
                return (char)((64+result));
            }
            return (char) ((c + num));
        }
        else                                // 공백일 경우
            return c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";

        System.out.print("문자열을 입력하세요 :");
        char[] str = br.readLine().toCharArray();
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }

        System.out.print("거리를 입력하세요 : ");
        Integer num = Integer.valueOf(br.readLine());

        CaesarPassword cp = new CaesarPassword();

        for(int i=0; i<str.length; i++){
            result += cp.solution(str[i],num);
        }
        System.out.println(result);
    }
}
