package CircularLinkedList;
public class CircularLL {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }
    private Node head = null;
    private Node tail = null;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void printList() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);

        System.out.print("Circular Linked List: ");
        cll.printList();
    }
}

