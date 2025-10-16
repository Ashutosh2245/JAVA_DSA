package DoublyLinkedList;
import java.util.Scanner;
public class LC2181_MergeNodesInBetweenZero {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp = head.next;  // skip first zero
        int sum = 0;
        while (temp != null) {
            if (temp.val != 0) {
                sum += temp.val;
            } else {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
    public static ListNode createLinkedList(int n, Scanner sc) {
        if (n == 0) return null;
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        return head;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in linked list: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements (start and end must be 0): ");
        ListNode head = createLinkedList(n, sc);

        ListNode result = mergeNodes(head);

        System.out.print("Merged linked list: ");
        printList(result);
    }
}
