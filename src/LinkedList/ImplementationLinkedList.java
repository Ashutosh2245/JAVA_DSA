//Inserting at end in empty linked list
package LinkedList;
class SingleLL { //User defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
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
public class ImplementationLinkedList {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        System.out.println("Initial Size: "+list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.print();
        list.insertAtEnd(50);
        list.print();
        System.out.println("Final size: "+list.size);
    }
}
