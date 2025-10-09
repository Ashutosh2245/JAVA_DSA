package LinkedList;
import java.util.Scanner;
public class PartitionLinkedList86 {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node partitionList(Node head, int x){
        Node a = new Node(-1);
        Node b = new Node(-1);
        Node tempA = a;
        Node tempB = b;
        Node temp = head;
        while(temp!=null){
            if(temp.val<x){
                tempA.next = temp;
                tempA = tempA.next;
            }
            else {
                tempB.next = temp;
                tempB= tempB.next;
            }
            temp = temp.next;
        }
        tempB.next = null;
        a = a.next;
        b = b.next;
        if(a==null) return b;
        tempA.next = b;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter LL elements: ");
        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        Node partition = partitionList(head,x);
        System.out.print("LL after partition: ");
        print(partition);
    }
    public static void print(Node head){
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
}
