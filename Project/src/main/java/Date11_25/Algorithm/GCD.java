package Date11_25.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 최대공약수 구하기(GCD: Greatest Common Divisor) - 코드업 2623번 문제
    2개의 값을 입력받아 2개의 최대 공약수를 얻을 수 있다.

    유클리드 호제법 공식 사용하여 최대공약수를 구한다.
    유클리드 호제법 : https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
 */
public class GCD {
    public static int solution(int num, int num2){
        /* 만약 70,42를 입력받는다고 하면
            70 % 42 = 28    -- num = 70, num2 = 42
            42 % 28 = 14    -- num = 42, num2 = 28
            28 % 14 = 0     -- num = 28, num2 = 14
            14 % 0          -- num = 14, num2 = 0 이므로 재귀함수가 빠져나옴과 동시에 num값을 반환함
         */
        if(num2 == 0) return num;

        return solution(num2,num%num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번째 수를 입력하세요:");
        int num = Integer.parseInt(br.readLine());
        System.out.print("두번째 수를 입력하세요:");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(solution(num>num2 ? num:num2,num>num2 ? num2:num));      // 큰값이 첫번째 매개변수로 갈 수 있도록 구성

    }
}
