package bai_tap;

import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stack<Integer> temp = new Stack<>();
//        Iterator<Integer> iterator = stack.iterator();
//        while (iterator.hasNext()) {
//            temp.push(stack.pop());
//        }
        for (int i = stack.size(); i > 0; i--) {
            temp.push(stack.pop());
        }
        stack = temp;
        System.out.println(stack);
        Stack<String> strings = new Stack<>();
        strings.push("Dang");
        strings.push("Van");
        strings.push("Nam");
        Stack<String> tempString = new Stack<>();
        for (int i = strings.size(); i > 0; i--) {
            tempString.push(strings.pop());
        }
        strings = tempString;
        System.out.println(strings);
    }
}
