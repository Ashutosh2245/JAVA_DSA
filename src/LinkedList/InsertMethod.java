//Inserting at end in empty linked list
package LinkedList;
class SinglyLL { //User defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        Node temp = new Node(val);
        Node x = temp;
        for (int i = 0; i <= idx; i++) {
            x = x.next;
        }
        //Insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val +" ");
            temp = temp.next;
        }
    }
}
public class InsertMethod {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        System.out.println("Initial Size: "+list.size);
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.print();
        list.insertAtHead(50);
        list.print();
        list.insert(2,90);
        list.print();
        System.out.println("Final size: "+list.size);
    }
}
