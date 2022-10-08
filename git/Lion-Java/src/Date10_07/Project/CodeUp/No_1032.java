package Date10_07.Project.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        int num = Integer.parseInt(s);

        System.out.printf("%x",num);        // 소문자 x는 16진수 소문자로 출력
    }
}
