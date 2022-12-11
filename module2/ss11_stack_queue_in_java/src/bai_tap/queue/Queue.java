package bai_tap.queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = null;
            return;
        }

    }
}
