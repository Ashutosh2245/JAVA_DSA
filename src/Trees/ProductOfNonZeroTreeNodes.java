// Binary Tree
package Trees;
public class ProductOfNonZeroTreeNodes {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static long product(Node root) {
        if (root == null) return 1;
        long leftProd = product(root.left);
        long rightProd = product(root.right);
        if (root.val == 0) {
            return leftProd * rightProd;
        }
        return root.val * leftProd * rightProd;
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
        System.out.println("Product of non zero nodes: "+product(a));
    }
}
// Binary Search Tree

/*package Trees;
import java.util.*;
class ProductOfNonZeroTreeNodes {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
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
    public static long product(Node root) {
        if (root == null) return 1;
        long leftProd = product(root.left);
        long rightProd = product(root.right);
        if (root.val == 0) {
            return leftProd * rightProd;
        }
        return root.val * leftProd * rightProd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }
        System.out.println("Product: "+product(root));
    }
}
*/