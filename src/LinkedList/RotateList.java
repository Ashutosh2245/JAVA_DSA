package LinkedList;
import java.util.Scanner;
public class RotateList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;
        k = k % length;
        int steps = length - k;
        ListNode newTail = current;
        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();
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
        rl.printList(head);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        head = rl.rotateRight(head, k);
        System.out.println("List after rotating by " + k + " steps:");
        rl.printList(head);
    }
}
