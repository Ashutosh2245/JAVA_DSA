package Trees;
import java.util.*;
public class InvertBinaryTreeLC226 {
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
    public static void invert(Node root) {
        if (root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the tree nodes: ");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        System.out.print("Inverted tree(preorder): ");
        invert(root);
        preorder(root);
    }
}
