package Date11_23.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 재귀함수(2)
    한 정수n을 입력받아 1부터 n까지의 정수 합을 출력하라
 */
public class Recursion2 {
    public int solution(int num){
        if(num == 0){
            return 0;
        }

        return num + solution(num-1);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n의 값을 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        Recursion2 r2 = new Recursion2();
        System.out.println(r2.solution(num));
    }
}
