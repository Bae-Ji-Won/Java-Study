package Date10_17.Algorithm;

/* 알고리즘 문제

    별찍기(직각 삼각형)
 */
public class Star {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
