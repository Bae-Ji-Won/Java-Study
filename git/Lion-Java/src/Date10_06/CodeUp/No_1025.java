package Date10_06.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        String[] cmd = s.split("");

        System.out.println("["+Integer.parseInt(cmd[0]) * 10000+"]");
        System.out.println("["+Integer.parseInt(cmd[1]) * 1000+"]");
        System.out.println("["+Integer.parseInt(cmd[2]) * 100+"]");
        System.out.println("["+Integer.parseInt(cmd[3]) * 10+"]");
        System.out.println("["+Integer.parseInt(cmd[4]) * 1+"]");

    }
}
