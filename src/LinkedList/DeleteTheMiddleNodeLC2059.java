package LinkedList;
public class DeleteTheMiddleNodeLC2059 {
    public static class ListNode{
        public int data;
        public ListNode next;
        public ListNode(int val){
            this.data = val;
            this.next = null;
        }
        public ListNode(int val,ListNode next){
            this.data = val;
            this.next = next;
        }
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp = new ListNode(0,head);
        ListNode slow = temp;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print("Original list: ");
        printList(head);
        ListNode node = deleteMiddle(head);
        System.out.print("New list: ");
        printList(node);

    }
}
