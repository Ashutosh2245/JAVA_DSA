//Inserting at end in empty linked list
package LinkedList;
class SLL { //User defined data structure
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
    int get(int idx) throws Exception{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Exception("Invalid Index");
        }
        Node temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;

        }
        return temp.val;
    }

    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class getMethod {
    public static void main(String[] args) {
        SLL list = new SLL();
        System.out.println("Initial Size: "+list.size);
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.print();
        list.insertAtHead(50);
        list.print();
        //list.get(3);
        System.out.println("Final size: "+list.size);
    }
}
