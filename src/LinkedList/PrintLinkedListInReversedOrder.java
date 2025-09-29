package LinkedList;
public class PrintLinkedListInReversedOrder {
    public  static void print(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public  static void displayRecursively(Node head){
        if(head==null) return; // base case
        displayRecursively(head.next);
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        Node a = new Node(10); //head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        displayRecursively(a);
    }
}
