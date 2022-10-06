package Date10_05.CodeUp;

import java.util.Scanner;

public class No_1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        String s = scan.nextLine();
        String[] str = s.split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);

        System.out.println(a+" "+b);
    }
}
