package Date10_28.Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 프로그래머스 해쉬 - 폰켓몬
  1. 폰켓몬의 종류가 담긴 배열이 주어짐
  2. 다른종류의 폰켓몬을 고를 수 있는 횟수의 최댓값을 구함
  ex. {1,2,3,3}  1번 폰켓몬 = 1마리, 2번 폰켓몬 = 1마리,3번 폰켓몬 = 2마리 일떄
  폰켓몬은 4/2 = 2마리를 선택할 수 있다.
  이때 서로 다른 폰켓몬을 가져가야 하는 상황은
  1,2
  1,3
  2,3 이므로
  최대 다른 종류의 2가지 폰켓몬을 가져갈 수 있다.
 */
public class Pokemon {
    public int choosemax(int[] nums){
        int count = (nums.length)/2;     // 선택할 수 있는 폰켓몬 수
        
        Set<Integer> set = new HashSet<>();
        
        for(int num:nums){  // nums의 배열을 1개씩 set에 넣어줌
                            // set의 특성을 활용해 중복 제거
            set.add(num);
        }

        int answer = (set.size()>count)? count:set.size();
        // set의 크기가 count보다 클경우 count 출력, 작을경우 set 원소개수 출력

        return answer;
    }

    public static void main(String[] args) {
        Pokemon p = new Pokemon();
        int result1 = p.choosemax(new int[]{3,1,2,3});
        int result2 = p.choosemax(new int[]{3,3,3,2,2,4});
        int result3 = p.choosemax(new int[]{3,3,3,2,2,2});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
