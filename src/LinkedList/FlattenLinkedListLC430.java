package LinkedList;
import java.util.*;
public class FlattenLinkedListLC430 {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node child;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }
    public Node flatten(Node head) {
        if (head == null) return null;
        Node temp = head;
        while (temp != null) {
            Node n = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                Node d = c;
                while (d.next != null) {
                    d = d.next;
                }
                temp.next = c;
                c.prev = temp;
                d.next = n;
                if (n != null) n.prev = d;
                temp.child = null;
            }
            temp = n;
        }
        return head;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print("  ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node buildList(Scanner sc) {
        System.out.print("Enter number of nodes in this level: ");
        int n = sc.nextInt();
        if (n <= 0) return null;
        System.out.print("Enter values of nodes: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr.next.prev = curr;
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            System.out.print("Does node " + curr.val + " have a child list? (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                curr.child = buildList(sc);
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlattenLinkedListLC430 obj = new FlattenLinkedListLC430();
        Node head = buildList(sc);

        Node flattened = obj.flatten(head);
        System.out.print("\nFlattened Linked List: ");
        printList(flattened);
    }
}
