package Date10_22.Algorithm;

import java.util.Arrays;

// 프로그래머스 K번째 수
public class Solution {
    public int[] solution(int[] arr,int[][]commands){
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){
            int[] slicedArr = Arrays.copyOfRange(arr,command[0]-1,command[1]);  // 배열을 자른다
            Arrays.sort(slicedArr);     // 배열을 정렬한다.
            answer[idx++] = slicedArr[command[2]-1];
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
