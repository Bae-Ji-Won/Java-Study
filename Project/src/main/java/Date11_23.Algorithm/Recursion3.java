package Date11_23.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 재귀함수(3) 코드업 1854번 문제
    재귀로 각 자리 수의 합 리턴하기
 */
public class Recursion3 {
    public int solution(int num){
        if(num == 0){
            return 0;
        }

        int result = num % 10;

        return result + solution(num/10);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n의 값을 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        Recursion3 r3 = new Recursion3();
        System.out.println(r3.solution(num));
    }
}
