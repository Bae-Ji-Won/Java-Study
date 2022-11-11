package Date11_09.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*  선택정렬(1)
     index = 0번부터 제일 작은 값으로 채워 나감
     ex) index = 0 1 2 3 4     
         value = 5 7 3 1 2        일떄
         index 0번째 자리의 값을 다른 index 값과 모두 비교해서 제일 작은 값으로 바꿈 즉, 1과 자리를 바꿈
 */

public class SelectionSort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int[] solution(int[] arr){
        int[] result = arr;

        for(int i=0; i<arr.length; i++){
            int minidx = i;
            for(int j=i; j<arr.length; j++){
                if(result[minidx]>result[j])        // interface를 통해 값만 구현후 원하는 식에 넣어 사용
                    minidx = j;
            }
            int temp = result[i];
            result[i] = result[minidx];
            result[minidx] = temp;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        SelectionSort s = new SelectionSort();
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[temp.length];

        for(int i=0; i<temp.length; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }

        System.out.println(Arrays.toString(s.solution(arr)));
    }
}