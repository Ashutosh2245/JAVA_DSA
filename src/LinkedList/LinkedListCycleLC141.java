package LinkedList;
import java.util.*;
class LinkedListCycleLC141{
    public static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("false");
            return;
        }
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        int pos = sc.nextInt();
        if (pos != -1) {
            Node cycleStart = head;
            for (int i = 0; i < pos; i++) {
                cycleStart = cycleStart.next;
            }
            curr.next = cycleStart;
        }
        boolean has = hasCycle(head);
        if(has) System.out.println("true");
        else System.out.println("false");
    }
}

