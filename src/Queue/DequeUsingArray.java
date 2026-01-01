package Queue;
public class DequeUsingArray {
    static class Deque {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void insertRear(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Deque is Full!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear < arr.length - 1) {
                rear++;
                arr[rear] = val;
            }
            else { // rear == arr.length - 1
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public void insertFront(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Deque is Full!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if (front > 0) {
                front--;
                arr[front] = val;
            }
            else { // front == 0
                front = arr.length - 1;
                arr[front] = val;
            }
            size++;
        }
        public int deleteFront() throws Exception {
            if (size == 0) {
                throw new Exception("Deque is Empty!");
            }
            int val = arr[front];
            if (front == arr.length - 1)
                front = 0;
            else front++;
            size--;
            if (size == 0) front = rear = -1;
            return val;
        }
        public int deleteRear() throws Exception {
            if (size == 0) {
                throw new Exception("Deque is Empty!");
            }
            int val = arr[rear];
            if (rear == 0)
                rear = arr.length - 1;
            else rear--;
            size--;
            if (size == 0) front = rear = -1;
            return val;
        }
        public void display() {
            if (size == 0) {
                System.out.println("Deque is Empty!");
                return;
            }
            if (front <= rear) {
                for (int i = front; i <= rear; i++)
                    System.out.print(arr[i] + " ");
            }
            else {
                for (int i = front; i < arr.length; i++)
                    System.out.print(arr[i] + " ");
                for (int i = 0; i <= rear; i++)
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Deque dq = new Deque();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();   // 2 5 10 20
        System.out.println("Deleted Front: " + dq.deleteFront());
        dq.display();   // 5 10 20
        System.out.println("Deleted Rear: " + dq.deleteRear());
        dq.display();   // 5 10
    }
}
