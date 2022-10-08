package Date10_07.Project.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        int num = Integer.parseInt(s,8);    // 8진수로 저장한다는 뜻

        System.out.printf("%d",num);
    }
}
