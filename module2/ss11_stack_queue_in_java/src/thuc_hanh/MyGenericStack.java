package thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    // method push()
    public void push(T element) {
        stack.addFirst(element);
    }

    // method pop()
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // method size()
    public int size() {
        return stack.size();
    }

    // method isEmpty()
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
