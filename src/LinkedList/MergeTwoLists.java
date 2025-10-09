package LinkedList;
import java.util.Scanner;
public class MergeTwoLists {
    public static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static Node mergeTwoSortedLists(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = l1;
        Node temp2 = l2;
        while (temp1!=null && temp2!=null){
            if (temp1.data <= temp2.data){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1==null) temp.next = temp2;
        if (temp2==null) temp.next = temp1;
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of 1st LL: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of 1st LL: ");
        Node head1 = new Node(sc.nextInt());
        Node current1 = head1;
        for (int i = 1; i < n; i++) {
            current1.next = new Node(sc.nextInt());
            current1 = current1.next;
        }

        System.out.print("Enter the size of 2nd LL: ");
        int m = sc.nextInt();
        System.out.print("Enter elements of 2nd LL: ");
        Node head2 = new Node(sc.nextInt());
        Node current2 = head2;
        for (int i = 1; i < m; i++) {
            current2.next = new Node(sc.nextInt());
            current2 = current2.next;
        }
        Node merged = mergeTwoSortedLists(head1,head2);
        System.out.print("Merged list is: ");
        printList(merged);
    }
}