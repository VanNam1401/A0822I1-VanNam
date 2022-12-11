package demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(10); // chuyá»ƒn vá» Object
//        arrayList.add("Hello");
//        arrayList.add(new Student());
//        ((Student)arrayList.get(2)).study();
//        for (Object o:arrayList) {
//            if (o instanceof Student){
//                ((Student)o).study();
//            }
//        }
//        ArrayList<Student> arrayList1 = new ArrayList<>();
////         arrayList1.add(1);
//        arrayList1.add(new Student());
//        arrayList1.get(0).study();
        // sá»­ dá»¥ng class GÃªnric do mÃ¬nh tá»± Ä‘á»‹nh nghÄ©a
//        MyClassGeneric<String> myClassGeneric = new MyClassGeneric<>();
//        myClassGeneric.setT("Hello");
//        System.out.println(myClassGeneric.getT());
//        MyClassGeneric<Student> myClassGeneric1 = new MyClassGeneric<>();
//        myClassGeneric1.setT(new Student());
//        System.out.println(myClassGeneric1.getT());
        // demo stack
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//        int s = stack.size();
//        for (int i = 0; i < s; i++) {
//            System.out.println(stack.pop());
//
//        }

//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack);

        // demo Queue
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
//        queue.add(null);
//        queue.offer(null);
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
//        System.out.println(queue);
    }
}

