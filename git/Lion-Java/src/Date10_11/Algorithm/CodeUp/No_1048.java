package Date10_11.Algorithm.CodeUp;

import java.util.Scanner;

public class No_1048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.println(num1<<num2);

      // num1을 2의 num2제곱만큼 곱한값을 출력한다
    }
}