package DoublyLinkedList;
import java.util.Scanner;
public class DeletionInDLL {
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
    // Insert at end (to build the list easily)
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
    // Delete a node by value
    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        // If head is to be deleted
        if (temp.data == key) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            System.out.println("Deleted node with value " + key);
            return;
        }
        // Search for the node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found!");
            return;
        }
        // Adjust pointers
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
        System.out.println("Deleted node with value " + key);
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
    public static void main(String[] args) {
        DeletionInDLL dll = new DeletionInDLL();
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

        System.out.print("\nEnter a node value to delete: ");
        int val1 = sc.nextInt();
        dll.deleteNode(val1);
        dll.displayForward();
        dll.displayBackward();

        System.out.print("\nEnter another node value to delete: ");
        int val2 = sc.nextInt();
        dll.deleteNode(val2);
        dll.displayForward();
        dll.displayBackward();
        sc.close();
    }
}
