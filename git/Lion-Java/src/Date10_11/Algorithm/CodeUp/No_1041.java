package Date10_11.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char c = bf.readLine().charAt(0);

        int num = (int)c;

        System.out.println((char)(num+1));
    }
}
