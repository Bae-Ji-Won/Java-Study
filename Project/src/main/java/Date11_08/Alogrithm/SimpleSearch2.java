package Date11_08.Alogrithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
    CodeUp 3001 데이터 탐색 ( 바이너리 서치 - 이진탐색으로 구하기)
    1. 몇개의 데이터를 입력할 것인지 n 입력
    2. n개의 갯수만큼 데이터 입력
    3. 찾고 싶은 값을 입력
    4. 찾고 싶은 값의 위치를 출력 만약 없는 값이라면 -1 반환
    5. 이전에는 배열에 저장된 값들을 모두 비교해 하나하나 찾았다면 이진탐색으로는 오름차순으로 정렬하여 절반을 나눠
       값보다 큰지 작은지 범위를 줄여나가면서 찾는방식이다.
       ex) {1,2,3,4,5,6,7}일때 5를 찾아야 하는 경우 절반인 4의 값을 가져와 4보다 큰지 작은지 비교하고 크다면
           {5,6,7}을 중 6를 가져와 6보다 큰지 작은지 비교하여 작다면 5를 출력함
 */
public class SimpleSearch2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution(int num) throws IOException {
        int[] nums = new int[num];      // 입력한 값들 저장소의 크기 설정
        String[] temp = br.readLine().split(" ");

        for(int i=0; i<num; i++){       // 값들을 입력받아 배열에 저장
            nums[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(nums);          // 오름차순으로 정렬함

        int targetnum = Integer.parseInt(br.readLine());     // 찾을 값

        int startIdx = 0;   // 시작 인덱스
        int endIdx = nums.length -1;    // 마지막 인덱스
        int targetIdx = -1;      // 찾고 싶은 값의 index 값 즉, 결과값

        // 1,2,3,4,5,6,7
        // 6/2 = 3

        while(startIdx<=endIdx){
            int midIdx = endIdx/2;          // 중간 index
            int midnum = nums[midIdx];      // 중간값

            if(midnum > targetnum)          // midnum이 targetnum 보다 클 경우
                endIdx = midIdx;            // 인덱스 끝점을 midIdx로 바꿔줌

            else if(midnum < targetIdx)     // midnum이 targetnum 보다 작을 경우
                startIdx = midIdx;          // 인덱스 시작점을 midIdx로 바꿔줌

            else                            // midnum이 targetnum이랑 같을경우
                targetIdx += midIdx;         // 찾을 index가 midIdx이므로 targetIdx에 midIdx 저장
        }
        return targetIdx;
    }

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        SimpleSearch s = new SimpleSearch();
        System.out.println(s.solution(num));
    }
}
