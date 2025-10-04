package LinkedList;
import java.util.*;
class DeleteDuplicatesLC82 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            boolean duplicate = false;
            while (curr.next != null && curr.val == curr.next.val) {
                duplicate = true;
                curr = curr.next;
            }
            if (duplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
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
        DeleteDuplicatesLC82 sol = new DeleteDuplicatesLC82();
        ListNode result = sol.deleteDuplicates(head);
        printList(result);
    }
}

