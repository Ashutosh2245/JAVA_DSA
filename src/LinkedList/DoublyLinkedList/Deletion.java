package LinkedList.DoublyLinkedList;
public class Deletion {
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

    public static void insert(int data) {

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

    public static void deleteBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    public static void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    public static void deleteValue(int value) {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }


        if (temp == head) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        temp.prev.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

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