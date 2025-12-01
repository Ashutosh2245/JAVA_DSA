package LinkedList;
import java.util.*;
class DeleteNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LL: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of LL: ");
        ListNode2 head = new ListNode2(sc.nextInt());
        ListNode2 current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode2(sc.nextInt());
            current = current.next;
        }
        System.out.print("Enter target node: ");
        int target = sc.nextInt();
        ListNode2 node = head;
        while (node != null && node.val != target) {
            node = node.next;
        }
        Solution1 sol = new Solution1();
        sol.deleteNode(node);
        ListNode2 cur = head;
        System.out.print("Modified Linked List: ");
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val) {
        this.val = val;
    }
}
class Solution1 {
    public void deleteNode(ListNode2 node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
