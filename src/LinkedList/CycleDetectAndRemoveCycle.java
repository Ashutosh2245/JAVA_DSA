package LinkedList;

public class CycleDetectAndRemoveCycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return null;
        }

        Node temp = head;

        while (slow != temp) {
            slow = slow.next;
            temp = temp.next;
        }

        return slow;
    }

    public static void removeLoop(Node head) {
        Node cycleStart = detectCycle(head);

        if (cycleStart == null) return;

        Node curr = cycleStart;
        while (curr.next != cycleStart) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public static void print(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        Node cycle = detectCycle(n1);

        if (cycle != null) {
            System.out.println("Cycle starts at: " + cycle.data);
        }

        removeLoop(n1);

        System.out.println("After removing loop:");
        print(n1);
    }
}