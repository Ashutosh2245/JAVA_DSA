package LinkedList.CircularLinkedList;

public class DoublyCircularLL {

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

    static Node head = null;

    static void insertBeginning(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

            newNode.next = head;
            newNode.prev = head;

            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;

        head = newNode;
    }


    static void insertEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

            newNode.next = head;
            newNode.prev = head;

            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;
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

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        Node newNode = new Node(data);

        Node nextNode = temp.next;

        newNode.prev = temp;
        newNode.next = nextNode;

        temp.next = newNode;
        nextNode.prev = newNode;
    }

    static void displayForward() {

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

    static void displayBackward() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node last = head.prev;
        Node temp = last;

        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != last);

        System.out.println();
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);

        System.out.println("Forward:");
        displayForward();

        System.out.println("Backward:");
        displayBackward();

        insertBeginning(5);

        System.out.println("After inserting 5 at beginning:");
        displayForward();

        insertEnd(40);

        System.out.println("After inserting 40 at end:");
        displayForward();

        insertPosition(15, 3);

        System.out.println("After inserting 15 at position 3:");
        displayForward();

        System.out.println("Backward:");
        displayBackward();
    }
}