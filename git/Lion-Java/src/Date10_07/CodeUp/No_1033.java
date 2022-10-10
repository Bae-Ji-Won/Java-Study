package Date10_07.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        int num = Integer.parseInt(s);

        System.out.printf("%X",num);        // 대문자 x는 16진수 대문자로 출력
    }
}
