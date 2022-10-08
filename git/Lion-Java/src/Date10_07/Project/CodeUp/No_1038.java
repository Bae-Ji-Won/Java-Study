package Date10_07.Project.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");

        long num1 = Long.parseLong(str[0]);
        long num2 = Long.parseLong(str[1]);

        System.out.println(num1 + num2);
    }
}
