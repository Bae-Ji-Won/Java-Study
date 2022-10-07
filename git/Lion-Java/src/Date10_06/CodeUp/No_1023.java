package Date10_06.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();
        String[] str = num.split("[.]");        // 점(도트)를 "."으로 사용하지 않고 [.]으로 사용한 이유는
                                                      // 정규식에서 점은 임의의 한 문자를 의미한다
                                                      // 따라서 []사이에 넣어서 문자로 취급해줘야 분리가 가능하다.
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(a);
        System.out.println(b);
    }
}
