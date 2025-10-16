//package LinkedList;
//import java.util.Scanner;
//public class ReverseLLLC206 {
//    public static class Node {
//        int val;
//        Node next;
//        public Node(int val){
//            this.val = val;
//            this.next = null;
//        }
//    }
//    public static Node reverse(Node head){
//        Node curr = head;
//        Node prev = null;
//        Node Next = null;
//        while (curr!=null){
//            Next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = Next;
//        }
//        return prev;
//    }
//    public void printList(Node head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of LL: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the elements of LL: ");
//        Node head = new Node(sc.nextInt());
//        Node curr = head;
//        for (int i = 1; i < n; i++) {
//            curr.next = new Node(sc.nextInt());
//            curr = curr.next;
//        }
//        System.out.print("Original LL: ");
//        ReverseLLLC206 rev = new ReverseLLLC206();
//        rev.printList(head);
//
//        head = reverse(head);
//        System.out.print("Reversed LL: ");
//        rev.printList(head);
//    }
//}

// METHOD 2

package LinkedList;
import java.util.Scanner;
public class ReverseLLLC206 {
    public static class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node reverse(Node head){
       if (head==null || head.next==null) return head;
       Node a = head.next;
       Node newHead = reverse(a);
       a.next = head;
       head.next = null;
       return newHead;
    }
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of LL: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of LL: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        System.out.print("Original LL: ");
        ReverseLLLC206 rev = new ReverseLLLC206();
        rev.printList(head);

        head = reverse(head);
        System.out.print("Reversed LL: ");
        rev.printList(head);
    }
}
