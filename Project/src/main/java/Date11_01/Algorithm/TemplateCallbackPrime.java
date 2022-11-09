//package Date11_01.Algorithm;
//
//interface StatementStrategy{
//    //인터페이스 이용
//    boolean compare(int a , int b);
//}
//
//public class TemplateCallbackPrime {
//    //Template Callback
//    boolean someOperation(int a, int b) {
//        return a < b;
//    }
//
//    boolean isPrime(int num){
//        boolean isPrime(int num,StatementStrategy stmt){
//            // i < num
//            // i < num/2
//            // i*i < num  i * i 쓰는이유 i*i<num == i<Math.sqrt(num)
//            for (int i = 2; someOperation(i,num); i++) {
//                for (int i = 2; stmt.compare(i,num); i++) {
//                    if(num%i == 0 ) return false;
//                }
//                return true;
//            }
//
//            public static void main(String[] args) {
//                TemplateCallbackPrime tcp = new TemplateCallbackPrime();
//                boolean b = tcp.isPrime(17);
//                System.out.println(b);
//                System.out.println(tcp.isPrime(13, (a, b)-> a < b));
//                System.out.println(tcp.isPrime(17, (a, b)-> a < b/2));
//                System.out.println(tcp.isPrime(19, (a, b)-> a * a < b));
//
////            @Override
////        boolean b = tcp.isPrime(17, new StatementStrategy() {
////            public boolean compare(int a, int b) {
////                return a * a <= b;
////            }
////        });
//
//            }
//        }