package Date10_05.CodeUp;

import java.util.Scanner;

public class No_1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] str = s.split(" ");

        char x = str[0].charAt(0);
        char y = str[1].charAt(0);

        char temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println(x+" "+y);
    }
}
