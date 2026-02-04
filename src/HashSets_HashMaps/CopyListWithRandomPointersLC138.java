// METHOD 1

/*package HashSets_HashMaps;
public class CopyListWithRandomPointersLC138 {

    public static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
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
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = head.next;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            copy.next = (copy.next != null) ? copy.next.next : null;
            curr = curr.next;
        }

        return newHead;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int r = (curr.random != null) ? curr.random.val : -1;
            System.out.println(curr.val + " " + r);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copied = copyRandomList(n1);

        printList(copied);
    }
}
*/

// METHOD 2
package HashSets_HashMaps;
import java.util.*;
public class CopyListWithRandomPointersLC138{
    public static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }
    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Node head2 = new Node(head.val);
        Node temp2 = head2;
        Node temp = head.next;

        while (temp != null) {
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = dup;
            temp = temp.next;
        }

        HashMap<Node, Node> map = new HashMap<>();
        temp = head;
        temp2 = head2;

        while (temp != null) {
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.random != null)
                map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        return head2;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int r = (curr.random != null) ? curr.random.val : -1;
            System.out.println(curr.val + " " + r);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copied = copyRandomList(n1);
        printList(copied);
    }
}
