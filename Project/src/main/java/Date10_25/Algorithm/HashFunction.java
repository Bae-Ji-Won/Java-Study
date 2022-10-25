package Date10_25.Algorithm;

public class HashFunction {
    public int hash(String key) {
        int asciiSum = 0;
        for(int i=0; i<key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.hash("yeong");
    }
}
