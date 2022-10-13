package Date10_13.Algorithm;


/* 버블정렬
 (1) swap 자리 바꾸기
 (2) 이중 for문
 (3) 이중 for문 control

*/

import java.util.Arrays;
public class BubbleSort {

        public int[] sort(int[] arr){
            for(int i=1; i<arr.length; i++) {
                for (int j = 0 ; j < arr.length-i; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {7,2,3,9,28,11};
            BubbleSort b = new BubbleSort();
            int[] result = b.sort(arr);

            System.out.println(Arrays.toString(result));
        }
}
