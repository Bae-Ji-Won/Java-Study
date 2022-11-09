package Date11_03.Algorithm;


import java.util.Arrays;

/* 프로그래머스 소수찾기 (에라토스테네스의 체를 통한 풀이)
    이전에 했던 리스트를 통한 에라토스테네스의 체를 통한 풀이는 속도가 느려 통과가 안되는 문제가 발생했다
    따라서 배열을 통해 속도를 좀 더 높힐 수 있도록 했다.
 */
public class PrimeNumber {
    public int solution(int num) {

        int count = 0;
        boolean[] result = new boolean[num+1];    // 0~n까지 크기
        Arrays.fill(result,true);       // 배열 true로 채움(boolean 배열의 초기값은 false라 굳이 안채워줘도 되지만 라이브러리 사용을 위해 사용)


        // 0과 1은 소수가 아니므로 false를 넣어준다.
        result[0] = false;
        result[1] = false;

        // n의 제곱근보다 작은 정수의 배수들만 지우면 n보다 작은 소수만 남게 됨
        for(int i= 2; i*i<=num; i++){         // 2~7까지의 배수값 구함    7*7 = 49
            
            // j = i*i로 해줘야 자기 자신값은 제외가 됨. 2,3,5,7은 소수이므로 자기 자신의 값은 제외해야함
            // ex) i=2일때, 2는 소수이므로 4부터 시작하여 4,6,8,10... 값을 false로 대입
            // i=4일때, 어차피 4는 i=2일때 false를 대입했으므로 자기 자신의 값을 신경안써줘도 됨
            for(int j =i*i; j<result.length; j+=i){
                    result[j] = false;
            }
        }

        for(int i=0; i<result.length; i++){
            if(result[i] == true)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
        PrimeNumber pm2 = new PrimeNumber();
        System.out.println(pm.solution(10));
        System.out.println(pm2.solution(5));
    }
}
