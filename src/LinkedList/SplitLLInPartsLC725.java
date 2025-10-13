package LinkedList;
import java.util.Scanner;
public class SplitLLInPartsLC725 {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node[] splitLL(Node head, int k){
        Node[] parts = new  Node[k];
        int len = 0;
        Node curr = head;
        while (curr!=null){
            len++;
            curr=curr.next;
        }
        int width = len/k;
        int remainder = len%k;
        curr = head;
        for (int i = 0; i < k; i++) {
            Node partHead = curr;
            int partSize = width+(remainder > 0 ? 1:0);

            for (int j = 0; j < partSize-1 && curr != null; j++) {
                curr = curr.next;
            }
            if(curr!=null){
                Node next = curr.next;
                curr.next = null;
                curr = next;
            }
            parts[i] = partHead;
            if(remainder>0) remainder--;
        }
        return parts;
    }
    public static void printList(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of LL: ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+ " node values: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        Node[] parts = splitLL(head,k);

        for (int i = 0; i < parts.length; i++) {
            System.out.print("Part "+(i+1)+": ");
            printList(parts[i]);
        }
    }
}
