package Date10_21.Algorithm;

import java.util.Stack;

public class StackBracket {
    boolean answer(String s){
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='(')     // (입력시 stack 저장
                stack.push(c);
            else if(stack.empty()) {     // 만약 스택이 비어있는 상태에 )입력시 false 출력
                return false;
            }
            else            // (있는 상태에서 )입력시 pop
                stack.pop();
        }
        return stack.empty();
    }
}
