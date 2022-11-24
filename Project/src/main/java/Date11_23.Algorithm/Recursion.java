package Date11_23.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  재귀함수 문제 - 코드업 1851번
    n을 입력받아 n개의 별을 출력하기(재귀 사용)
 */
public class Recursion {

    public String solution(int num){

        if(num == 0){
            return "";
        }

        return "*" + solution(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n의 값을 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());
        Recursion r = new Recursion();
        System.out.println(r.solution(num));
    }
}
