package Date10_06.collection;

public class RndNumberSwitchoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i =0; i<50; i++) {
            randomNumberGenerator.generate(10);
        }
    }
}
