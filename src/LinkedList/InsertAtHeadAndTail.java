//Inserting at head or tail in linked list
package LinkedList;
class SinglyLinkedList { //User defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){ //Empty linked list
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null){ //Empty linked list
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class InsertAtHeadAndTail {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Initial Size: "+list.size);
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insertAtHead(40);
        list.print();
        System.out.println();
        list.insertAtTail(50);
        list.print();
        System.out.println();
        System.out.println("Final size: "+list.size);
    }
}

