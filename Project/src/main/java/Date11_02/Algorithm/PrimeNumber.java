package Date11_02.Algorithm;

import java.util.ArrayList;
import java.util.List;

/* 프로그래머스 소수찾기 (에라토스테네스의 체를 통한 풀이)
    소수가 아닌 값을 제외시켜 최종적으로 소수인 값만 남기는 방식

    이전에 했던 코드가 O(N)이라면 에라토스테네스의 체는 O(Log N)정도의 속도가 나온다.
 */
public class PrimeNumber {

    // 리스트를 통한 풀이
    public int solution(int num){
        List<Integer> nums = new ArrayList<>();

        // 1은 소수가 아니므로 2부터 시작
        for(int i =2; i<=num; i++){
            nums.add(i);
        }

        // removeif( )  list의 메서드로 조건문을 통해 해당하는 값은 제거시킨다.

        // 2부터 num-1번값까지
        // 일반 for문으로 i<=num으로 돌리면 num값이 클경우 너무 많은 반복을 하게됨
        // 따라서 i의 제곱이 num보다 작거나 같을때까지 반복하게 되면 모든 소수를 찾을 수 있고 반복횟수도 적어짐
        // ex) num = 10일때, i는 2,3만 들어갈수 있음
        //
        for(int i=2; i*i<=num; i++) {
            for (int j = 0; j < nums.size(); j++) {
                // 배수이면서 자기자신은 아니여야 함
                if (nums.get(j) % i == 0 && nums.get(j) != i) {
                    nums.remove(j);
                }
            }
        }
        return nums.size();
    }

    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        System.out.println(p.solution(10));     // 시간초과 발생
    }
}
