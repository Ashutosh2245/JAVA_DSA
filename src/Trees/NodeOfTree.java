package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); // it is the root.
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        System.out.println("Root Node: "+a.val);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(a.left.val); //b
        System.out.println(a.right.val); //c or a.right
        System.out.println(a.left.left.val); //b.left or d
        System.out.println(a.left.right.val); //b.right or e
        System.out.println(a.right.right.val); //c.right or f
        System.out.println(a.right.left); //c.left or null
        a.left.left.val = 10;
        System.out.println(a.left.left.val);
    }
}
