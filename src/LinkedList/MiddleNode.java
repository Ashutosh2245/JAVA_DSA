package LinkedList;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val) {
        this.val = val;
    }
    public static ListNode1 createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode1 head = new ListNode1(arr[0]);
        ListNode1 current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode1(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void printList(ListNode1 head) {
        ListNode1 current = head;
        while (current != null) {
            System.out.print(current.val + "  ");
            current = current.next;
        }
        System.out.println("null");
    }
}
class Sol {
    public ListNode1 middleNode(ListNode1 head) {
        if (head == null) return null;
        ListNode1 slow = head;
        ListNode1 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class MiddleNode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode1 head = ListNode1.createList(values);
        System.out.print("Original list: ");
        ListNode1.printList(head);
        Sol solution = new Sol();
        ListNode1 middle = solution.middleNode(head);
        System.out.println("Middle node value: " + middle.val);
        System.out.print("Middle to end: ");
        ListNode1.printList(middle);
    }
}
