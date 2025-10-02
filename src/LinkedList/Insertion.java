package LinkedList;
class Node5 {
    public int data;
    public Node5 next;
    public Node5(int value) {
        this.data = value;
        this.next = null;
    }
}
public class Insertion {
    public static Node5 insertAtBeginning(Node5 head, int value) {
        Node5 newNode = new Node5(value);
        newNode.next = head;
        return newNode;
    }
    public static Node5 insertAtEnd(Node5 head, int value) {
        Node5 newNode = new Node5(value);
        if (head == null) {
            return newNode;
        }
        Node5 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node5 insertAtLocation(Node5 head, int value, int position) {
        Node5 newNode = new Node5(value);
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }
        Node5 current = head;
        for (int i = 1; i < position - 1 && current != null; i++)
        {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position.");
            return head;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void displayLinkedList(Node5 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node5 head = null;

        head = insertAtBeginning(head, 1);
        displayLinkedList(head);

        head = insertAtEnd(head, 3);
        displayLinkedList(head);

        head = insertAtLocation(head, 2, 2);
        displayLinkedList(head);
    }
}
