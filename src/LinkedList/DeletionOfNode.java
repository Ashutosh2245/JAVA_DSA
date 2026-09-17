package LinkedList;
public class DeletionOfNode {

    public static class Node {
        int data;
        Node next;
        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public static Node deleteFromBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        Node newHead = head.next;
        head.next = null; // disconnect old head
        return newHead;
    }

    public static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (head.next == null) {
            return null; // only one node
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }
    // Delete by value
    public static Node deleteNode(Node head, int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (head.data == value) {
            Node newHead = head.next;
            head.next = null;
            return newHead;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node with value " + value + " not found.");
            return head;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp.next = null;
        return head;
    }
    // Delete at position (0-based index)
    public static Node deleteAtPosition(Node head, int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position or empty list.");
            return head;
        }
        if (pos == 0) {
            return deleteFromBeginning(head);
        }
        Node current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return head;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp.next = null;
        return head;
    }
    // Display linked list
    public static void displayLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Original List:");
        displayLinkedList(head);
        head = deleteFromBeginning(head);
        System.out.println("After deleting from beginning:");
        displayLinkedList(head);
        head = deleteFromEnd(head);
        System.out.println("After deleting from end:");
        displayLinkedList(head);
        head = deleteNode(head, 2);
        System.out.println("After deleting node with value 2:");
        displayLinkedList(head);
        head = deleteAtPosition(head, 0);
        System.out.println("After deleting node at position 0:");
        displayLinkedList(head);
    }
}
