package Date10_18.Algorithm;


// 정사각형
public class Square {
    public static void main(String[] args) {
        Square s = new Square();
        s.printSquare(3);
        System.out.println();
        s.printRectangle(3,5);
    }

    void printSquare(int n){            // 정사각형
        for(int i=0; i<n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    void printRectangle(int x, int y){
        for(int i =0; i<x; i++){
            System.out.println("*".repeat(y));
        }
    }
}
