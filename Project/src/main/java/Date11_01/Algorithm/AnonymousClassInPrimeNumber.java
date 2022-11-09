package Date11_01.Algorithm;

// inteface 포함
interface Strategy{
    boolean compare(int a, int b);
}

public class AnonymousClassInPrimeNumber {
    boolean isPrime(int num, Strategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AnonymousClassInPrimeNumber acip = new AnonymousClassInPrimeNumber();
        //람다 사용
        boolean r = acip.isPrime(17,(a,b)->a*a<=b);
        
//        boolean r = acip.isPrime(17, new Strategy() {
//            @Override
//            public boolean compare(int a, int b) {
//                return a * a <= b;
//            }
//        });

    }
}