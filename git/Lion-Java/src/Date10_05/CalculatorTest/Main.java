package Date10_05.CalculatorTest;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator randomNumbercalculator = new Calculator(numberGenerator);

        randomNumbercalculator.plus();

        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        specificNumberCalculator.plus();
    }
}
