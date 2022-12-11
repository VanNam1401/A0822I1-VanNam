package bai_tap.queue;

public class Solution {
    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.head = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
}
}
