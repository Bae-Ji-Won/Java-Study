package Date10_06.collection.set;

public class RandomAlphabetGenerator implements AlphabetGenerator{
    @Override
    public char generate(){
        return (char)((int)(Math.random()*26)+65) ;
    }

}
