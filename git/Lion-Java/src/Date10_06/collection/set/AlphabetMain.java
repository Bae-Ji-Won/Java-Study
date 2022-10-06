package Date10_06.collection.set;

import java.util.HashSet;
import java.util.Set;

public class AlphabetMain {
    public static void main(String[] args) {
        RandomAlphabetGenerator alphabetGenerator = new RandomAlphabetGenerator();

        Set<Character> characters = new HashSet<>();

        for (int i = 0; i <50; i++){
            char alphabet = alphabetGenerator.generate();
            System.out.println(alphabet + " ");
            characters.add(alphabet);
        }

        System.out.println(characters);
    }
}