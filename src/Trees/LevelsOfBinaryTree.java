// BINARY TREE
package Trees;
public class LevelsOfBinaryTree {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right) );
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println("Levels: "+levels(a));
        System.out.println("Height of binary tree: "+(levels(a)-1));
    }
}
// BINARY SEARCH TREE

/*package Trees;
import java.util.*;
public class LevelsOfBinaryTree {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right) );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }
        System.out.println("Levels: "+levels(root));
        System.out.println("Height of binary tree: "+(levels(root)-1));
    }
}
*/
