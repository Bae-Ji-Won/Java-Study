package Date10_05.CalculatorTest;

public class SpecificNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return 2000*num;
    }
}
