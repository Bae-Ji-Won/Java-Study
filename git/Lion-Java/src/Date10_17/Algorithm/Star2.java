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
        for(int i=0; i<num; i++){           // 라인 개수만큼 반복
            for(int j = 1; j<num-i; j++){       // 별자리 앞에까지 빈공간 채워넣기
                System.out.print(" ");
            }
            for(int z = 0; z<i*2+1; z++){       // 별 개수를 점점 늘려나감
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
