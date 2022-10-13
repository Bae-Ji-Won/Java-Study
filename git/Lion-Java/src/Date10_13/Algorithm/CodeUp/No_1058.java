package Date10_13.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1058 {
    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        boolean num1 = Integer.parseInt(str[0]) != 0;
        boolean num2 = Integer.parseInt(str[1]) != 0;

        System.out.print(num1||num2? 0:1);
    }
}
