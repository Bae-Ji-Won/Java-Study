package Date10_22.Algorithm;

import java.util.Arrays;

/* 프로그래머스 K번째 수 구하기
질문 : array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
      array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
      1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
      2에서 나온 배열의 3번째 숫자는 5입니다.
      i는 최소 1이여야함
 */
public class Solution {
    public int[] solution(int[] arr,int[][]commands){
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){                                              // ex) [2,5,3] 들어감
            int[] slicedArr = Arrays.copyOfRange(arr,command[0]-1,command[1]);  // 배열을 자른다   2-1,5  => 1~4까지 자름 [5,2,6,3] 
            Arrays.sort(slicedArr);     // 배열을 정렬한다.    [2,3,5,6]
            answer[idx++] = slicedArr[command[2]-1];    //3-1 = 2번째 자리 수 저장함,  5 저장
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(Arrays.toString(s.solution(arr,commands)));
    }
}
