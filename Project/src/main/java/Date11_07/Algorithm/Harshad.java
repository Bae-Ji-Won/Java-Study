package Date11_07.Algorithm;

/*
    프로그래머스 하샤드문제
    1. 입력받은 수의 자릿값들을 더함
    2. 입력받은 수를 자릿값들의 합으로 나눔
    3. 이때 값이 딱 떨어지게 나누어지면 하샤드 수임
 */
public class Harshad {
    // int로 값을 받아 계산하는 방식
    public boolean solution(int x){

        int num = x;
        // 자리수 합
        int sumOfDigit = 0;         // 자릿수 합
        while(x>0){
            sumOfDigit += x%10;
            x = x/10;
        }

        if(num%sumOfDigit == 0){
            return true;
        }

        return false;
    }

    //String으로 값을 받아 계산하는 방식
    public boolean solution2(int x){
        String[] num = String.valueOf(x).split(""); // 입력받은 숫자를 문자열 배열 한자리씩 나눔

        int sum = 0;
        for(String s : num){        // 문자열 배열에 저장된 자릿수의 값들을 한개씩 뽑아 모두 더함
            sum += Integer.parseInt(s);
        }

        if(x%sum == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Harshad hs = new Harshad();
        System.out.println(hs.solution2(10));
        System.out.println(hs.solution2(11));
    }
}
