package Date10_05.CodeUp;

import java.util.Scanner;

public class No_1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] str = s.split("\\.");
        int A = Integer.valueOf(str[0]);
        int B = Integer.valueOf(str[1]);
        int C = Integer.valueOf(str[2]);
        System.out.printf("%04d.%02d.%02d",A,B,C);
    }
}
