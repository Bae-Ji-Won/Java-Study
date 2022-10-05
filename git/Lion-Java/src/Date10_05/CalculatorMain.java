package Date10_05;

import java.util.Scanner;


class Calculator{
    public static int plus(int num,int num2){
        return num+num2;
    }

    public static int min(int num, int num2){
        return num-num2;
    }

    public static int mul(int num, int num2){
        return num*num2;
    }

    public static int div(int num, int num2){
        return num/num2;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(c.plus(num,num2));
        System.out.println(c.min(num,num2));
        System.out.println(c.mul(num,num2));
        System.out.println(c.div(num,num2));
    }



}
