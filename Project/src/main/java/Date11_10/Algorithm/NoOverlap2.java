package Date11_10.Algorithm;

/*  프로그래머스 (같은 숫자는 싫어) - stack을 통한 풀이
    1. 0~9까지의 값을 담은 배열이 주어짐
    2. 연속되는 숫자중 중복되는 값은 제거함
    3. 중복 제거한 값(배열)을 리턴하는데 원소들의 순서를 유지함
    ex) {4,4,4,3,3} 일때 {4,3}이 리턴되야함 또한 {1, 1, 3, 3, 0, 1, 1}이 입력되었을때 {1,3,0,1}이 리턴되야함
 */

import java.util.Arrays;
import java.util.Stack;

public class NoOverlap2 {
    public int[] solution(int[] nums){
        Stack<Integer> numlist = new Stack<>();
        numlist.push(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(numlist.peek() != nums[i])       // 스택에 있는 가장 높은 값을 가져와 비교함
                numlist.push(nums[i]);
        }

        int[] result = new int[numlist.size()];
        for (int i = numlist.size()-1; i>=0; i--) {          // 스택은 후입선출이기때문에 거꾸로 넣어줘야함
            result[i] = numlist.pop();                  
        }

        return result;
    }

    public static void main(String[] args) {
        NoOverlap2 no = new NoOverlap2();
        System.out.println(Arrays.toString(no.solution(new int[]{4,4,4,3,3})));
        System.out.println(Arrays.toString(no.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
