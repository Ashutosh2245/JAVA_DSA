package LinkedList;
class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLL {
    private Nodes head;
    public void add(int data) {
        Nodes newNode = new Nodes(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Nodes current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public int getElement(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can't be negative");
        }
        Nodes current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }
}
public class MyLinkedList {
    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.getElement(0));
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(2));
    }
}
