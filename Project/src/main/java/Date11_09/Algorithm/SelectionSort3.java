package Date11_09.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/*  /*  선택정렬(3) - ByFunction 사용해서 구현해보기
     index = 0번부터 제일 작은 값으로 채워 나감
     ex) index = 0 1 2 3 4
         value = 5 7 3 1 2        일떄
         index 0번째 자리의 값을 다른 index 값과 모두 비교해서 제일 작은 값으로 바꿈 즉, 1과 자리를 바꿈
 */
public class SelectionSort3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // BiFunction을 사용한 풀이
    public int[] solution(int[] arr, BiFunction<Integer,Integer,Boolean> stmt){
        int[] result = arr;

        for(int i=0; i<arr.length; i++){
            int minidx = i;
            for(int j=i; j<arr.length; j++){
                if(stmt.apply(arr[minidx],arr[j]))        // apply 결과값이 참일때 동작함
                    minidx = j;
            }
            int temp = result[i];
            result[i] = result[minidx];
            result[minidx] = temp;
        }

        return result;
    }

    // BiPredicate을 사용한 풀이 BiPredicate도 <Integer,Integer,Boolean>을 사용해야하지만 default값이 boolean이기 때문에 Boolean은 생략 가능
    public int[] solution2(int[] arr, BiPredicate<Integer,Integer> stmt){
        int[] result = arr;

        for(int i=0; i<arr.length; i++){
            int minidx = i;
            for(int j=i; j<arr.length; j++){
                if(stmt.test(arr[minidx],arr[j]))        // apply 결과값이 참일때 동작함
                    minidx = j;
            }
            int temp = result[i];
            result[i] = result[minidx];
            result[minidx] = temp;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {

        SelectionSort3 s = new SelectionSort3();
        System.out.print("정렬할 값들을 입력하세요 :");
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[temp.length];

        for(int i=0; i<temp.length; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }

        BiFunction<Integer,Integer,Boolean> biFunction = (a,b) -> a>b;
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a<b;

     //   BiFunction<Integer,Integer,Boolean> biFunction2 = (a,b) -> a<b;

        System.out.println(Arrays.toString(s.solution(arr,biFunction)));
        System.out.println(Arrays.toString(s.solution2(arr,biPredicate)));
    }
}
