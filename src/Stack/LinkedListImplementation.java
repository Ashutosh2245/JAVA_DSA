package Stack;
import java.util.*;
public class LinkedListImplementation {
    public static class Node { // User-defined data type
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class LLStack { // User-defined data structure
        private Node head = null;
        private int size = 0;
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--; // fix added
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h) {
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }
        void display() { // prints from bottom to top
            displayRec(head);
            System.out.println();
        }
        void displayRev() { // prints from top to bottom
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            return size;
        }
        boolean isEmpty() {
            return size == 0;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4); st.display();
        st.push(5); st.display();
        st.push(1); st.display();
        System.out.println("Popped: " + st.pop());
        st.display();
        System.out.println("Top element: " + st.peek());
        System.out.println("Current size: " + st.size());
        System.out.println("Is empty ? --> " + st.isEmpty());

        st.push(7);
        st.push(0);
        st.display();

        st.push(100);
        st.display();
        st.displayRev();
    }
}
// LL me insertion aage se hoga kyuki singly LL me aage(head) pe insertion and deletion
// O(1) me hota hai but tail me O(n) lagta hai.