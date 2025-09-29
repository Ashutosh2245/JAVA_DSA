//Inserting at beginning in empty linked list
package LinkedList;
class SingleLL1 { //User defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtStart(int val){
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
    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class InsertAtBeginning {
    public static void main(String[] args) {
        SingleLL1 list = new SingleLL1();
        System.out.println("Initial Size: "+list.size);
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.print();
        System.out.println();
        list.insertAtStart(50);
        list.print();
        System.out.println();
        System.out.println("Final size: "+list.size);
    }
}
