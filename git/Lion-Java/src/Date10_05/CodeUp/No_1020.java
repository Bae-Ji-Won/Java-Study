package Date10_05.CodeUp;

import java.util.Scanner;

public class No_1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String[] str = s.split("-");

        String result="";

        for(int i=0; i<str.length; i++){
            result += str[i];
        }

        System.out.println(result);
    }
}
