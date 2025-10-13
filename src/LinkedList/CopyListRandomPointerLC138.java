package LinkedList;
public class CopyListRandomPointerLC138 {
    public static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }

        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.random = head;
        node3.random = node5;
        node4.random = node3;
        node5.random = head;

        Node copiedHead = copyRandomList(head);
        System.out.println("List copied successfully ");
    }
}

