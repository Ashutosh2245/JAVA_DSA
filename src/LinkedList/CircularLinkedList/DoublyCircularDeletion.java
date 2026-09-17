package LinkedList.CircularLinkedList;
class DoublyCircularDeletion {
    static class Node {
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

    static void insert(int data) {

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

    static void deleteBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;

        head = head.next;

        head.prev = last;
        last.next = head;
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

        Node last = head.prev;
        Node secondLast = last.prev;

        secondLast.next = head;
        head.prev = secondLast;
    }

    static void deleteValue(int value) {

        if (head == null) {
            return;
        }

        Node temp = head;

        do {

            if (temp.data == value) {

                if (temp.next == temp) {
                    head = null;
                    return;
                }

                if (temp == head) {
                    deleteBeginning();
                    return;
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;

                return;
            }

            temp = temp.next;

        } while (temp != head);
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