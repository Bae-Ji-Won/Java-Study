package Date10_14.Algorithm;

// 삽입정렬

import java.util.Arrays;

public class InsertSort {

    static int[] sort(int[] arr){
        int i = 1;

        if(arr[i] < arr[i-1]){
            int tmp;

            tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        System.out.println(Arrays.toString(sort(arr)));
    }
} 
