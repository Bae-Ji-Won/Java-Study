package Date10_11.Algorithm;

public class Programmers_12931 {
    public static void main(String[] args) {
        int num = 123;

        String str = String.valueOf(num);
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println(result);
    }
}
