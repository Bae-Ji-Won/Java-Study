package Date10_17.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 알고리즘 문제

    별찍기(피라미드 삼각형)
 */
public class Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        input(num);
    }

    static void input(int num){
        for(int i=0; i<num; i++){
            for(int j = 1; j<num-i; j++){
                System.out.print(" ");
            }
            for(int z = 0; z<i*2+1; z++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
