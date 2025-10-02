//Intersection of two linkedLists
package LinkedList;
class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6(int x) {
        val = x;
        next = null;
    }
}
class Intersection {
    public static ListNode6 getIntersectionNode(ListNode6 headA, ListNode6 headB) {
        if (headA == null || headB == null) return null;

        ListNode6 a = headA;
        ListNode6 b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
    public static void printList(ListNode6 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode6 intersect = new ListNode6(8);
        intersect.next = new ListNode6(4);
        intersect.next.next = new ListNode6(5);

        ListNode6 headA = new ListNode6(4);
        headA.next = new ListNode6(1);
        headA.next.next = intersect;

        ListNode6 headB = new ListNode6(5);
        headB.next = new ListNode6(6);
        headB.next.next = new ListNode6(1);
        headB.next.next.next = intersect;

        System.out.print("List A: ");
        printList(headA);

        System.out.print("List B: ");
        printList(headB);

        ListNode6 result = getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersected at node with value: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}

