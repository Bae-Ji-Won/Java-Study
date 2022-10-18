package Date10_18.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 평행사변형
public class Parallelogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        new Parallelogram().parallelogram(num);
    }

    public void parallelogram(int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.print(" ");
            }
            System.out.println("*".repeat(n));
        }
    }
}
