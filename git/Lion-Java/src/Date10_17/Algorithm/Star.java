package Date10_17.Algorithm;

import Date10_13.Algorithm.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 알고리즘 문제

    별찍기(직각 삼각형)
 */
public class Star {
    private char letter = '*';

    public Star() {
    }

    public Star(char letter) {
        this.letter = letter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Star star = new Star('@');

        int num = Integer.parseInt(bf.readLine());      // 라인 개수 입력 받음

        star.input(num);
    }

    public void input(int num){
        for(int i=0; i<num; i++){           // 입력 받은 라인 개수 만큼 반복
            for(int j=0; j<i+1; j++) {
                System.out.printf("%s ",this.letter);
            }
            System.out.println("");
        }
    }

}
