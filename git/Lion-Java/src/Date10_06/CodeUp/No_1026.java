package Date10_06.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        String[] str = s.split(":");

        System.out.println(Integer.parseInt(str[1]));
    }
}
