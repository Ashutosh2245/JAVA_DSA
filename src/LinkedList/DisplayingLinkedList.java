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
//package LinkedList;
//
//import java.util.Scanner;
//
//public class DisplayingLinkedList {
//    public  static void print(Node head){
//        Node temp = head;
//        while (temp!=null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
//    }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        print(a);
//    }
//}

package LinkedList;
import java.util.Scanner;
public class DisplayingLinkedList{
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LL: ");
        int n  = sc.nextInt();
        System.out.print("Enter the elements of LL: ");
        Node head =  new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        System.out.print("Linked List: ");
        print(head);
    }
}