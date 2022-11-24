package Date11_23.Algorithm;

/* 재귀(4) 코드업 1855번
    재귀로 n번째 피보나치 수 리턴하기
 */
public class Recursion4 {
        public static void main(String[] args) {
            // 0부터 8까지의 피보나치 수 모두 출력
            for (int i=0; i<9; i++) {
                System.out.printf("%d\t", fibo(i));
            }
        }

        public static int fibo(int n) {
            // 전달받은 값과 동일한 값을 리턴한다면 계산할 필요가 없으므로 중단
            if (n <= 1) {
                return n;
            } else {
                return fibo(n-2) + fibo(n-1);
            }
        }
}
