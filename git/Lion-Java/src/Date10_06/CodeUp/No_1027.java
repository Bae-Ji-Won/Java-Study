package Date10_06.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        String[] str = s.split("[.]");

        for(int i=str.length-1; i>=0; i--){
            if(i!=0)
            System.out.print(str[i]+"-");
            else
                System.out.println(str[i]);
        }
    }
}
