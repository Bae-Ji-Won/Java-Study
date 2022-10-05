package Date10_05;

import java.util.Scanner;


class Calculator{
    private int num;
    private int num2;

    Calculator(int num, int num2){
        this.num = num;
        this.num2 = num2;
    }
    public int plus(){
        return num+num2;
    }

    public int min(){
        return num-num2;
    }

    public int mul(){
        return num*num2;
    }

    public double div(){
        return (double)num/(double)num2;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        Calculator c = new Calculator(num,num2);

        System.out.println(c.plus());
        System.out.println(c.min());
        System.out.println(c.mul());
        System.out.println(c.div());
    }



}
