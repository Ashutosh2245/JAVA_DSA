package LinkedList.CircularLinkedList;
public class SinglyCircularDeletion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int data) {

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

    static void deleteBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;

        temp.next = head;
    }

    static void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    static void deleteValue(int value) {

        if (head == null) {
            return;
        }

        if (head.data == value) {
            deleteBeginning();
            return;
        }

        Node temp = head;

        while (temp.next != head && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != head) {
            temp.next = temp.next.next;
        }
    }

    static void display() {

        if (head == null) {
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

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        display();

        deleteBeginning();
        display();

        deleteEnd();
        display();

        deleteValue(20);
        display();
    }
}