package Date10_14.Algorithm.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());      // 배열 사이즈 입력
        int[] arr = new int[num];

        for(int i = 0; i<num; i++) {                // 배열 값 입력 받음
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i<num; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i= num-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
