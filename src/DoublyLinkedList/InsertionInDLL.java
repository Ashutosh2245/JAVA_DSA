package DoublyLinkedList;
import java.util.Scanner;
public class InsertionInDLL {
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
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    // Insert after a specific node
    public void insertAfter(int key, int data) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }
    // Display forward
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Display backward
    public void displayBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        InsertionInDLL dll = new InsertionInDLL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of DLL: ");
        int n = sc.nextInt();
        System.out.print("Enter the nodes of LL: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            dll.insertAtEnd(data);
        }
        dll.displayForward();
        dll.displayBackward();

        System.out.print("Enter a num to insert at beginning: ");
        int val1 = sc.nextInt();
        dll.insertAtBeginning(val1);

        System.out.print("Enter a num to insert at last: ");
        int val2 = sc.nextInt();
        dll.insertAtEnd(val2);

        System.out.print("Enter the node after which to insert: ");
        int key = sc.nextInt();
        System.out.print("Enter the node value to insert after "+key+": ");
        int val3 = sc.nextInt();
        dll.insertAfter(key,val3);

        dll.displayForward();
        dll.displayBackward();

    }
}
