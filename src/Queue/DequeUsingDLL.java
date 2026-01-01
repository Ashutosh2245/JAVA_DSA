package Queue;
public class DequeUsingDLL {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }
    static class Deque {
        Node front = null;
        Node rear = null;
        int size = 0;
        void insertFront(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                front = rear = temp;
            } else {
                temp.next = front;
                front.prev = temp;
                front = temp;
            }
            size++;
        }
        void insertRear(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                front = rear = temp;
            } else {
                rear.next = temp;
                temp.prev = rear;
                rear = temp;
            }
            size++;
        }
        int deleteFront() {
            if (size == 0) {
                System.out.println("Deque is Empty!");
                return -1;
            }
            int val = front.data;
            if (size == 1) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }
            size--;
            return val;
        }
        int deleteRear() {
            if (size == 0) {
                System.out.println("Deque is Empty!");
                return -1;
            }
            int val = rear.data;
            if (size == 1) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
            size--;
            return val;
        }
        void display() {
            if (size == 0) {
                System.out.println("Deque is Empty!");
                return;
            }
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display(); // 2 5 10 20
        System.out.println("Deleted Front: "+dq.deleteFront()); // 2
        dq.display(); // 5 10 20
        System.out.println("Deleted Rear: "+dq.deleteRear());  // 20
        dq.display(); // 5 10
    }
}
