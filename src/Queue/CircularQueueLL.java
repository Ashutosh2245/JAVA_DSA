package Queue;
public class CircularQueueLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class CircularQueue {
        Node front = null;
        Node rear = null;
        int size = 0;
        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                front = rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
            }
            rear.next = front;   // maintain circle
            size++;
        }
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int val = front.data;
            if (size == 1) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            size--;
            return val;
        }
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return front.data;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);

            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.isEmpty());
        q.display(); // 1 2 3 4
        System.out.println("Peek: " + q.peek());
        q.remove();
        q.display(); // 2 3 4
        q.add(5);
        q.display(); // 2 3 4 5
        System.out.println("Size: " + q.size);
    }
}
