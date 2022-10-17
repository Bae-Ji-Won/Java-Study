package Date10_17.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        input(num);
    }

    static void input(int num){
        for(int i=0; i<num; i++){
            for(int j=1; j<num-i; j++){
                System.out.print(" ");
            }
            for(int z=0; z<i*2+1; z++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=num-2; i>=0; i--){
            for(int j=1; j<num-i; j++){
                System.out.print(" ");
            }
            for(int z=0; z<i*2+1; z++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
