package Stack;
public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[4];
        private int idx = 0;
        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full!!");
                return;
            }
            arr[idx++] = x;
        }
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return arr[idx - 1];
        }
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size() {
            return idx;
        }
        boolean isEmpty() {
            return idx == 0;
        }
        boolean isFull() {
            return idx == arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println("Popped: " + st.pop()); // 1
        st.display(); // 4 5
        System.out.println("Top element: " + st.peek()); // 5
        System.out.println("Current size: " + st.size()); // 2
        System.out.println(st.isEmpty()); // false
        System.out.println(st.isFull()); // false
        st.push(7);
        st.push(0);
        System.out.println(st.isFull()); // true
        st.display(); // 4 5 7 0
        st.push(100); // Stack is Full!!
    }
}
