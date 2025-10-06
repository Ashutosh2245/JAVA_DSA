package LinkedList;
import java.util.Scanner;
public class RemoveDuplicates {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List: ");
        int n = sc.nextInt();
        System.out.print("Enter LL elements: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        System.out.println("Original List:");
        rd.printList(head);
        head = rd.deleteDuplicates(head);
        System.out.println("List after removing duplicates:");
        rd.printList(head);
    }
}

