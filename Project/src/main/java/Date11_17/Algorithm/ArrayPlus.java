package Date11_17.Algorithm;

import java.util.Arrays;

/* 프로그래머스 행렬의 덧셈
  행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 된다.
  2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환해라

  ---- 제한 조건 ----
  행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않는다.
 */
public class ArrayPlus {
    public int[][] solution(int[][] arr1,int[][] arr2){
        int[][] result = new int[arr1.length][arr1[0].length];

        // 행 반복
        for(int i=0; i<arr1.length; i++){
            // 열 반복
            for(int j=0; j<arr1[0].length; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayPlus ap = new ArrayPlus();
        System.out.println(Arrays.deepToString(ap.solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}})));
        System.out.println(Arrays.deepToString(ap.solution(new int[][]{{1,2}},new int[][]{{3,4}})));
    }
}
