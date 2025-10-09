package LinkedList;
import java.util.Scanner;
public class MergeKSortedLists {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int val) {
            this.data = val;
        }
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1!=null && temp2!=null){
            if (temp1.data <= temp2.data){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1==null) temp.next = temp2;
        if (temp2==null) temp.next = temp1;
        return dummy.next;
    }
    private static ListNode mergeLists(ListNode[] lists, int left, int right) {
        if (left > right) return null;
        if (left == right) return lists[left];

        int mid = left + (right - left) / 2;
        ListNode l1 = mergeLists(lists, left, mid);
        ListNode l2 = mergeLists(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergeLists(lists, 0, lists.length - 1);
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of linked lists: ");
        int k = sc.nextInt();
        ListNode[] lists = new ListNode[k];
        for (int i = 0; i < k; i++) {
            System.out.print("Enter length of list " + (i+1) + ": ");
            int n = sc.nextInt();
            if (n == 0) {
                lists[i] = null;
                continue;
            }
            System.out.print("Enter elements of list " + (i+1) + ": ");
            ListNode head = new ListNode(sc.nextInt());
            ListNode curr = head;
            for (int j = 1; j < n; j++) {
                curr.next = new ListNode(sc.nextInt());
                curr = curr.next;
            }
            lists[i] = head;
        }
        ListNode merged = mergeKLists(lists);
        System.out.print("Merged List: ");
        printList(merged);
    }
}
