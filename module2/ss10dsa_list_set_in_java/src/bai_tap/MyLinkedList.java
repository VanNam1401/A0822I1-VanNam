package bai_tap;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    // phần tử đầu tiên của danh sách liên kết
    private Node head;
    // số lượng pần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {
    }

    // chèn phần tử và đầu mảng
    public void addFirst(E element) {
        // khai báo 1 biến là temp trỏ đến giá trị của head
        Node temp = head;
        // biến head nhận giá trị là 1 node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    // chèn phần tử vào cuối mảng
    public void addLast(E element) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        // sẽ cho con trỏ chạy đến phần tử cuối cùng danh sách.
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    // chèn phần tử vào vị trí index
    public void add(int index, E element) {
        // khai báo temp trỏ đến head
        Node temp = head;

        // khai báo 1 node là holder
        Node holder;

        //cho con trỏ chạy đến vị trí index - 1;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        // cho holder tham chiếu đến vị trí index
        holder = temp.next;
        // Node tại vị trí index - 1 trỏ tới vị trí node mới
        temp.next = new Node(element);
        // node mới sẽ trỏ đến holder
        temp.next.next = holder;
        // tăng số lượng phần tử trog ds lên 1
        numNodes++;
    }


    public void clear() {
        Node temp = head;
        while (temp != null) {
            temp.data = null;
            temp = temp.next;
            numNodes--;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        // nếu index hợp lệ thì khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        // nếu như index = 0 thì trả về data hiện tại
        if (index == 0) {
            data = temp;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        // remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            // khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                // nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        // kiểm tra LinkedList có phần tử hay không
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList nay null");
        }
        // khai báo linkedList trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        // khai báo 1 temp trỏ đến head
        Node temp = head;
        // add temp vào danh sách trả về để nó làm head của node mới
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrain(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // trả về vị trí của đối tượng truyên vào
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int size() {
        return numNodes;
    }

    public Object get(int index) {
        // khai báo biên stemp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getLast() {
        Node temp = head;
//        if (temp == null) {
//            return null;
//        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
//        if (head == null) {
//            return null;
//        }
        return (E) head.data;
    }
}
