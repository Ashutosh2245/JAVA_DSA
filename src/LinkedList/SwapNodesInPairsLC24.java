package LinkedList;
import java.util.Scanner;
public class SwapNodesInPairsLC24 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes in the list: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ListNode head = createList(arr);
        System.out.print("Original Linked List:");
        printList(head);
        head = swapPairs(head);
        System.out.print("Linked List After Swapping in Pairs:");
        printList(head);
        sc.close();
    }
}

