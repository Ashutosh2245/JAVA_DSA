package LinkedList;
import java.util.*;
class LinkedListCycleIILC142{
    public static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    public static Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if(slow!=fast) return null;
        else {
            Node temp = head;
            while (temp!=slow) {
                slow=slow.next;
                temp=temp.next;
            }
            return slow;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("false");
            return;
        }
        System.out.print("Enter LL elements: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        System.out.print("Enter position which is connected: ");
        int pos = sc.nextInt();
        if (pos != -1) {
            Node cycleStart = head;
            for (int i = 0; i < pos; i++) {
                cycleStart = cycleStart.next;
            }
            curr.next = cycleStart;
        }
        Node detectCycle = hasCycle(head);
        if(detectCycle!=null) System.out.println(detectCycle.data);
        else System.out.println("No Cycle (null)");
    }
}

