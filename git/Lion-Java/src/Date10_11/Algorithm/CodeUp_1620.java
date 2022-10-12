package Date10_11.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int result = 0;


        while(num>0){
            result += num%10;
            num /= 10;
        }

        System.out.println(result);
    }
}
