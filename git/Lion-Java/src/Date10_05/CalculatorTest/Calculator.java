package Date10_05.CalculatorTest;

public class Calculator {
    NumberGenerator numberGenerator;

    Calculator(NumberGenerator num){
         this.numberGenerator = num;
    }

    public void plus(){
        System.out.println(10+numberGenerator.generate(10));
    }
}
