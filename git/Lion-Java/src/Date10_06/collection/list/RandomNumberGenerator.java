package Date10_06.collection.list;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
