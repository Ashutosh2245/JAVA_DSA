package LinkedList;
import java.util.Scanner;
public class SortLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode left = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right = slow.next;
        slow.next=null;
        left = sortList(left);
        right = sortList(right);
        return mergeTwoLists(left, right);
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
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
        System.out.print("Enter length of LL: ");
        int n = sc.nextInt();
        System.out.print("Enter LL elements: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for(int i=1;i<n;i++){
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        System.out.print("Sorted List: ");
        ListNode sorted = sortList(head);
        printList(sorted);
    }
}

