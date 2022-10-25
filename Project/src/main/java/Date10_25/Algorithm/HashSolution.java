package Date10_25.Algorithm;

public class HashSolution {
    public int hash(String str) {
        int ascii = 0;
        for(int i = 0; i<str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000;
    }
}
