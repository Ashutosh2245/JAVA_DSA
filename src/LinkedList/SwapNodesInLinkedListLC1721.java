package LinkedList;
import java.util.*;
public class SwapNodesInLinkedListLC1721 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode fast = first;
        ListNode second = head;
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LL: ");
        int len = sc.nextInt();
        System.out.print("Enter the LL elements: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for (int i = 1; i < len; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        head = swapNodes(head, k);
        System.out.print("List after swapping: ");
        printList(head);
    }
}

