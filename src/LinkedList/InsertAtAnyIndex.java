//package LinkedList;
//class SinglyLinkedList1 { //User defined data structure
//    Node head;
//    Node tail;
//    int size;
//    void insertAtHead(int val){
//        Node temp = new Node(val);
//        if(head==null){ //Empty linked list
//            head = tail = temp;
//        }
//        else {
//            temp.next = head;
//            head = temp;
//        }
//        size++;
//    }
//    void insertAtTail(int val){
//        Node temp = new Node(val);
//        if(head==null){ //Empty linked list
//            head = tail = temp;
//        }
//        else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//    void insertAtAnyIndex(int idx, int val){
//        if(idx == 0) {
//            insertAtHead(val);
//            return;
//        }
//        if(idx == size){
//            insertAtTail(val);
//            return;
//        }
//        if(idx>size || idx<0){
//            System.out.println("Invalid Index!!");
//            return;
//        }
//        Node temp = new Node(val);
//        Node x = head;
//        for (int i = 1; i <=idx  ; i++) {
//            x = x.next;
//        }
//        temp.next = x.next;
//        x.next = temp;
//        size++;
//    }
//    void print(){
//        Node temp = head;
//        while (temp!=null) {
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//public class InsertAtAnyIndex {
//    public static void main(String[] args) {
//        SinglyLinkedList1 list = new SinglyLinkedList1();
//        System.out.println("Initial Size: "+list.size);
//        list.insertAtHead(10);
//        list.insertAtHead(20);
//        list.insertAtTail(30);
//        list.insertAtAnyIndex(3,70);
//        list.insertAtHead(40);
//        list.print();
//        System.out.println();
//        list.insertAtTail(50);
//        list.print();
//        list.insertAtAnyIndex(2,60);
//        System.out.println();
//        list.insertAtAnyIndex(10,99);
//        System.out.println("Final size: "+list.size);
//    }
//}
//
//


// METHOD 2
package LinkedList;
class SinglyLinkedList1 {
    Node head;
    Node tail;
    int size;
    void insertAtIndex(int idx, int val){ // Insert at any index (0 to size)
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp = new Node(val);
        if (idx == 0) {  // insert at head
            temp.next = head;
            head = temp;
            if (size == 0) tail = temp;
        }
        else if (idx == size) {   // insert at tail
            tail.next = temp;
            tail = temp;
        }
        else {  // insert in middle
            Node x = head;
            for (int i = 1; i < idx; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
        }
        size++;
    }
    void insertAtHead(int val){ insertAtIndex(0,val); }
    void insertAtTail(int val){ insertAtIndex(size,val); }
    void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class InsertAtAnyIndex {
    public static void main(String[] args) {
        SinglyLinkedList1 list = new SinglyLinkedList1();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insertAtIndex(3,70);
        list.insertAtHead(40);
        list.print();
        list.insertAtTail(50);
        list.print();
        list.insertAtIndex(2,60);
        list.print();
        list.insertAtIndex(10,99); // invalid index
        System.out.println("Final size: " + list.size);
    }
}
