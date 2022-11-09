package Date11_01.Algorithm;


/* 프로그래머스 소수찾기
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 문제
소수는 1과 자기 자신으로만 나누어지는 수를 의미
(1은 소수가 아니다)
ex) 1~10일때 [2,3,5,7] = 4개가 존재 

 */


public class PrimeNumber {
    boolean isPrime(int num){
        // 1은 소수가 아니니 2부터 자기자신보다 1작은수까지 나누어 나머지값을 구한다
        // 만약 이때 나머지 값이 0이 나온다면 소수가 아니므로 false 출력
        for(int i = 2; i<num; i++){
            if(num % i ==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.isPrime(13));

    }

}
