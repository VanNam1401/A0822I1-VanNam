package bai_tap.queue;

import java.util.EmptyStackException;

public class Queue<T> {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear = temp;
        this.rear.link = front;
    }

    public void deQueue() {
        if (this.front == null) {
            throw new EmptyStackException();
        } else if (this.rear == this.front) {
            this.front = this.rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }

    public void displayQueue() {
        Node temp = front;
        while(temp.link != front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
