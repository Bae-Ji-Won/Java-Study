package Date10_13.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.printf("%d",num1&num2);      // 비트단위 연산자
        // 두개의 값의 비트연산자를 더함(중복 자리의 값만 1로 반환)
        // ex)
        // 3       : 00000000 00000000 00000000 00000011
        // 5       : 00000000 00000000 00000000 00000101
        // 3 & 5   : 00000000 00000000 00000000 00000001
    }
}
