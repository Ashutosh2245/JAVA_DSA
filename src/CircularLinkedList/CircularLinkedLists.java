package CircularLinkedList;
public class CircularLinkedLists {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void insertEnd(int data) {
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

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void deleteNode(int key) {
        if (head == null) return;

        Node curr = head, prev = tail;

        do {
            if (curr.data == key) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public boolean search(int key) {
        if (head == null) return false;
        Node curr = head;
        do {
            if (curr.data == key) return true;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    public int countNodes() {
        if (head == null) return 0;
        int count = 0;
        Node curr = head;
        do {
            count++;
            curr = curr.next;
        } while (curr != head);
        return count;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedLists cll = new CircularLinkedLists();
        cll.insertEnd(1);
        cll.insertEnd(2);
        cll.insertEnd(3);
        cll.insertHead(0);

        System.out.print("Circular Linked List: ");
        cll.printList();

        System.out.println("Count: " + cll.countNodes());

        System.out.println("Search 2 in the Linked List: " + cll.search(2));
        System.out.println("Search 5 in the Linked List: " + cll.search(5));

        cll.deleteNode(0);
        cll.deleteNode(3);
        cll.deleteNode(2);

        System.out.print("After Deletions: ");
        cll.printList();
    }
}

