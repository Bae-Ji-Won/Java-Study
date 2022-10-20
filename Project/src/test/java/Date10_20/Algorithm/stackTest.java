package Date10_20.Algorithm;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class stackTest {
        stack st = new stack();

        @BeforeEach     // 무조건 제일 먼저 실행하고 시작함(공통값을 넣을때 주로 사용)
        void setUp() {

            System.out.println("before each");
        }

        @Test
        @DisplayName("push가 잘되는지")
        void push(){
            st.push(10);
            st.push(20);
            Integer[] arr = st.getArr();

            assertEquals(20,arr[1]);
            assertEquals(10,arr[0]);
        }

        @Test
        void pushAndPop(){
            st.push(10);
            st.push(20);

            assertEquals(20, st.pop());
            assertEquals(10, st.pop());
            // st.pop() 비어 있을땐?
            // Exception 예외의 검증
            assertThrows(RuntimeException.class,()->{
                st.pop();
            });
//        st.pop();
        }

        @Test
        void isEmpty() {
            assertTrue(st.isEmpty());
            st.push(20);
            assertFalse(st.isEmpty());
            st.pop();
            assertTrue(st.isEmpty());
        }

        @Test
        void realStack() {
            // 자바 스택 구현채 (미리 해놓은거)
            Stack<Integer> st = new Stack<>();
            assertThrows(EmptyStackException.class, ()->{
                st.pop();
            });
//        st.pop();

        }

        @Test
        void peek() {
            stack st = new stack();
            // 스택이 비었는데 peek 할 때
            assertThrows(EmptyStackException.class,()->{
                st.peek();
            });
            st.push(10);
            int peeked = st.peek();
            assertEquals(10,peeked);
        }
}
