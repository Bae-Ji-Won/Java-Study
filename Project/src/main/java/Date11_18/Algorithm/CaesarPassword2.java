package Date11_18.Algorithm;

/* 프로그래머스 시저암호(프로그래머스에서 원하는 방식대로 풀기)
--------  제한조건  --------
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.
 */
public class CaesarPassword2 {
    public String solution(String s, int n){

        String result = "";         // 최종 결과를 담을 문자열
        n = n%26;                   // n은 1~25사이인 자연수이므로
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isLowerCase(c)) {   // 소문자 일때
                c = (char)((c-'a'+n)%26 + 'a');
            // 입력된 문자가 z이면 아스키코드 122번이고 a의 아스키코드는 97이다
            // 입력받은 n의 값은 1일때
            // (122-97+1)%26 + 97  => (26)%26 + 97 => 0+97 => 97 (a)
            // 즉, 입력받은 문자열을 초기값인 a로 빼고 n만큼 더해 얼마나 증가가 되는지 계산한후
            // 소문자의 전체 갯수인 26개로 나머지값을 구함(소문자 아스키 코드는 97~122번 사이에 존재하므로 그 이상이 되면 다른 문자가 출력됨)
            // 만약 26으로 나머지 값을 구하지 않으면 26+97 = 123으로 { 문자가 출력됨 따라서 이를 방지하고자 소문자 범위 내에서 계산되도록 설정
            // 마지막으로 초기값 97(a)를 더해 증가된 문자를 출력함    
            }
            else if(Character.isUpperCase(c)) {   // 대문자 일때
                c = (char)((c-'A'+n)%26 + 'A');
            }
            result += c;
        }

        return result;
    }


    public static void main(String[] args) {
        CaesarPassword2 cp = new CaesarPassword2();
        System.out.println(cp.solution("AB",1));
        System.out.println(cp.solution("z",1));
        System.out.println(cp.solution("a B z",4));
    }
}
