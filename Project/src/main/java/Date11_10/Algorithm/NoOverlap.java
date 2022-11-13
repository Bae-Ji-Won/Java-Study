package Date11_10.Algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*  프로그래머스 (같은 숫자는 싫어) - list를 통한 풀이
    1. 0~9까지의 값을 담은 배열이 주어짐
    2. 연속되는 숫자중 중복되는 값은 제거함
    3. 중복 제거한 값(배열)을 리턴하는데 원소들의 순서를 유지함
    ex) {4,4,4,3,3} 일때 {4,3}이 리턴되야함 또한 {1, 1, 3, 3, 0, 1, 1}이 입력되었을때 {1,3,0,1}이 리턴되야함
 */
public class NoOverlap {
    public Object[] solution(int[] nums){
        List<Integer> numlist = new ArrayList<>();
        numlist.add(nums[0]);       // 이전값과 다음값을 비교하기 위해 미리 처음 숫자를 넣어줌

        // list 사이즈의 -1의 값이 새로들어오는 값과 같다면 추가안함
        // ex) {1,1,3,1}을 입력받을때 list에 처음값 1을 집어넣은 상태에서 반복문 실행
        // i = 1일때, listsize = 1이므로 numlist.get(1-1)의 값인 1을 가져와 nums[1]의 값인 1과 비교함
        // 이때 값이 중복되므로 list에 넣지 않음
        // i = 2일때, numlist.get(1-1)의 값인 1을 가져와 nums[2]의 값인 3과 비교 후 다르므로 list저장
        // i = 3일때, nulist.get(2-1)의 값인 3을 가져와 nums[3]의 값인 1과 비교 후 다르므로 list에 저장

        for(int i=1; i<nums.length; i++){
            if(numlist.get(numlist.size()-1) != nums[i])
                numlist.add(nums[i]);
        }

        return numlist.toArray();
    }

    public static void main(String[] args) {
        NoOverlap no = new NoOverlap();
        System.out.println(Arrays.toString(no.solution(new int[]{4,4,4,3,3})));
        System.out.println(Arrays.toString(no.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
