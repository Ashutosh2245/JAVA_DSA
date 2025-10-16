package LinkedList;
import java.util.Scanner;
public class InsertionSortLLLC147 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while (curr != null) {
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            ListNode nextTemp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = nextTemp;
        }
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Empty list.");
            return;
        }
        System.out.print("Enter the node values: ");
        int val = sc.nextInt();
        ListNode head = new ListNode(val);
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        System.out.print("Original linked list: ");
        printList(head);
        ListNode sortedHead = insertionSortList(head);
        System.out.print("Sorted linked list: ");
        printList(sortedHead);
    }
}
