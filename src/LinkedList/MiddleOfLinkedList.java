package LinkedList;
import java.util.Scanner;
public class MiddleOfLinkedList{
    public static class Node {
        public int data;
        public Node next;
        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Enter nodes value: ");
        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        Node mid = middleNode(head);
        System.out.println("Middle node value: " + mid.data);
    }
}
