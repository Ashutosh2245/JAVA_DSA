package LinkedList;
import java.util.*;
class DeleteFromNthEnd{
    public static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public Node removeNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null) {
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LL: ");
        int len = sc.nextInt();
        System.out.print("Enter the LL elements: ");
        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 1; i < len; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        System.out.print("Enter the Nth pos: ");
        DeleteFromNthEnd sol = new DeleteFromNthEnd();
        int n = sc.nextInt();
        head = sol.removeNthFromEnd(head, n);
        System.out.print("New LL: ");
        printList(head);
    }
}