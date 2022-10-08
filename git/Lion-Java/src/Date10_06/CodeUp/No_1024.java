package Date10_06.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        char[] str = new char[s.length()];

        for(int i =0; i<s.length(); i++) {
            str[i] = s.charAt(i);
            System.out.println("'"+str[i]+"'");
        }
    }
}
