package ex2;

import java.util.Stack;

public class StackTransfer {
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        Stack<E> temp = new Stack<>();
        while (!S.isEmpty()) {
            temp.push(S.pop());
        }
        while (!temp.isEmpty()) {
            T.push(temp.pop());
        }
    }
}
