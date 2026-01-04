// Binary Tree
package Trees;
public class MaximumAndMinimumNodes {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static int maximum(Node root){
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = maximum(root.left);
        int c = maximum(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int minimum(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minimum(root.left);
        int c = minimum(root.right);
        return Math.min(a,Math.min(b,c));

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
        System.out.println("Maximum Node: "+maximum(a));
        System.out.println("Minimum Node: "+minimum(a));
    }
}


// Binary Search Tree
/*package Trees;
import java.util.*;
public class MaximumAndMinimumNodes {
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
    public static int maximum(Node root){
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = maximum(root.left);
        int c = maximum(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int minimum(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minimum(root.left);
        int c = minimum(root.right);
        return Math.min(a,Math.min(b,c));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter node values:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }
        System.out.println("Minimum Value : " + minimum(root));
        System.out.println("Maximum Value : " + maximum(root));
    }
}
*/