package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListNOdeBasic {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(b.next);
        a.next = b; //Linking => a->b (10->20)
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(b.next);
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
    }
}
