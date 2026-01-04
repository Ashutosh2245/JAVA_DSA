package Stack;
import java.util.*;
public class PalindromeLinkedListLC234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        // 3. Compare both halves
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the linked list elements: ");
        ListNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        System.out.println("Palindrome: "+isPalindrome(head));
    }
}


/*package Stack;
import java.util.*;
public class PalindromeLinkedListLC234 {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        // Push all elements into stack
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        // Compare while popping
        temp = head;
        while (temp != null) {
            if (temp.val != st.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the LL elements: ");
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node newNode = new Node(x);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Palindrome: "+isPalindrome(head));
    }
}
*/