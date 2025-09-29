//package LinkedList;
//public class DisplayingLinkedList {
//    public static void main(String[] args) {
//        Node a = new Node(10); //head
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        Node temp = a;
//        for (int i = 1; i <=4 ; i++) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
//    }
//}

//Method 2
package LinkedList;
public class DisplayingLinkedList {
    public  static void print(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10); //head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        print(a);
    }
}

