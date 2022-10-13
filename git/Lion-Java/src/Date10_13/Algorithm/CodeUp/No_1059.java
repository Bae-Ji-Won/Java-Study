package Date10_13.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.printf("%d",~num);       // 비트단위논리연산
                                            // ~n = -n -1
                                            // ex) 2일때 ~2 = -2 -1
    }
}
