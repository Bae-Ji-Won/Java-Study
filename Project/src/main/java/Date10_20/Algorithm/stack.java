package Date10_20.Algorithm;


import java.util.EmptyStackException;

public class stack {
    private Integer[] arr;      // 스택 저장하는 공간
    private int top = 0;        // 현재 스택 최고점 위치 나타냄

    public stack() {            // 생성자를 통해 배열의 크기를 초기화함
        this.arr = new Integer[10000];
    }

    public stack(int size) {
        this.arr = new Integer[10000];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[top++] = value;
    }

// 예외처리 전
//    public int pop() {
//        return this.arr[--this.top];
//    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[--this.top];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.top - 1];
    }
}
