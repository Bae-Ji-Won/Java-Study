package Date11_08.Alogrithm;

import com.fasterxml.jackson.core.util.BufferRecycler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

/*
    CodeUp 3001 데이터 탐색
    1. 몇개의 데이터를 입력할 것인지 n 입력
    2. n개의 갯수만큼 데이터 입력
    3. 찾고 싶은 값을 입력
    4. 찾고 싶은 값의 위치를 출력 만약 없는 값이라면 -1 반환
 */
public class SimpleSearch {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution(int num) throws IOException {
        int[] nums = new int[num];      // 입력한 값들 저장소의 크기 설정
        String[] temp = br.readLine().split(" ");

        for(int i=0; i<num; i++){       // 값들을 입력받아 배열에 저장
             nums[i] = Integer.parseInt(temp[i]);
        }
        System.out.println(Arrays.toString(nums));

        System.out.print("찾을 숫자를 입력하세요 :");
        int findnum = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == findnum){
                result = i+1;
                break;
            }
            else
                result = -1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        SimpleSearch s = new SimpleSearch();
        System.out.println(s.solution(num));
    }
}
