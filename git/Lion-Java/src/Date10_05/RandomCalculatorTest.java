package Date10_05;

import java.util.Scanner;

class RandomCalculator{
    private int num;
    final int random;
    RandomCalculator(int num){
        this.num = num;
        this.random = num * (int)(Math.random()*9)+1;
    }

    public int plus(){
        return num + random;
    }

    public int min(){
        return num - random;
    }

    public int mul(){
        return num * random;
    }

    public Object div(){
        if(random == 0){
            return "랜덤하게 생성된 숫자가 0입니다.";
        }else
            return (double)num / (double)random;
    }

}

public class RandomCalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        RandomCalculator r = new RandomCalculator(num);

        System.out.println(r.plus());
        System.out.println(r.min());
        System.out.println(r.mul());
        System.out.println(r.div());
    }
}
