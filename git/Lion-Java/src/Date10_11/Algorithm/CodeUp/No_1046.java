package Date10_11.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int num3 = Integer.parseInt(str[2]);
        System.out.println(num1+num2+num3);
        System.out.printf("%.1f",(float)((num1+num2+num3))/str.length);
    }
}
