package DoublyLinkedList;
import java.util.Scanner;
public class ReverseDLL {
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    private Node head;
    // Insert at end to build list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }
    // Reverse the doubly linked list
    public void reverse() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = null;
        Node current = head;
        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        // After loop, temp will be at the node before new head
        if (temp != null)
            head = temp.prev;
        System.out.println("List reversed successfully!");
    }
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of DLL: ");
        int n = sc.nextInt();

        System.out.print("Enter the nodes of DLL: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            dll.insertAtEnd(data);
        }

        System.out.println("\nOriginal List:");
        dll.displayForward();
        dll.displayBackward();

        dll.reverse();

        System.out.println("\nReversed List:");
        dll.displayForward();
        dll.displayBackward();

        sc.close();
    }
}
