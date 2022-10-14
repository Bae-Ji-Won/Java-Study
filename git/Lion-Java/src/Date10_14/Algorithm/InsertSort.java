package Date10_14.Algorithm;

// 삽입정렬

import java.util.Arrays;

public class InsertSort {

    static int[] sort(int[] arr){

        for(int i=1; i<arr.length; i++) {       // arr[1] ~ arr[4] 까지 반복
            for (int j = i-1; j >= 0; j--) {    // 이전 값 모두 비교(이전값 개수만큼 반복)
                if (arr[j+1] < arr[j]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        System.out.println(Arrays.toString(sort(arr)));
    }
} 
 
