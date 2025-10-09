package LinkedList;
import java.util.Scanner;
public class OddEvenLinkedList328 {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node oddEvenLL(Node head){
        if (head == null || head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void print(Node head){
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of linked lists: ");
        int n = sc.nextInt();
        System.out.print("Enter LL elements: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        Node oddEven = oddEvenLL(head);
        System.out.print("New linked list: ");
        print(oddEven);
    }
}
