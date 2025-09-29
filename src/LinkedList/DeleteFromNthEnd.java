package LinkedList;
import java.util.Scanner;
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val) {
        this.val = val;
    }
}
class Solution5 {
    public ListNode3 removeNthFromEnd(ListNode3 head, int n) {
        ListNode3 dummy = new ListNode3(0);
        dummy.next = head;
        ListNode3 first = dummy;
        ListNode3 last = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            last = last.next;
        }
        last.next = last.next.next;
        return dummy.next;
    }
}
public class DeleteFromNthEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ListNode3 head = new ListNode3(sc.nextInt());
        ListNode3 current = head;
        for (int i = 1; i < size; i++) {
            current.next = new ListNode3(sc.nextInt());
            current = current.next;
        }

        Solution5 sol = new Solution5();
        head = sol.removeNthFromEnd(head, 2);

        ListNode3 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
