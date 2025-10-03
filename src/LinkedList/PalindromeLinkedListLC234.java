package LinkedList;
public class PalindromeLinkedListLC234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow.next);
        ListNode firstHalf = head;
        ListNode copySecond = secondHalf; // to restore
        boolean palindrome = true;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        slow.next = reverse(copySecond);

        return palindrome;
    }
    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Palindrome:- " + isPalindrome(head));
    }
}

