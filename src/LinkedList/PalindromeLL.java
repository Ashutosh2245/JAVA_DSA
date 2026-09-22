package LinkedList;
import java.util.*;
public class PalindromeLL {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node Next = null;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }


    public static boolean isPalindrome(Node head) {

        Node middle = middleNode(head);
        Node second = reverseLL(middle);

        Node first = head;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
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

        System.out.println(isPalindrome(head));
    }
}