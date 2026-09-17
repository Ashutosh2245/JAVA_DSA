package LinkedList.CircularLinkedList;
public class SinglyCircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    static void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    static void insertPosition(int data, int pos) {

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertBeginning(data);
            return;
        }

        if (head == null) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);

        System.out.println("Original List:");
        display();
        insertBeginning(5);

        System.out.println("After inserting 5 at beginning:");
        display();
        insertEnd(40);

        System.out.println("After inserting 40 at end:");
        display();
        insertPosition(15, 3);

        System.out.println("After inserting 15 at position 3:");
        display();
    }
}