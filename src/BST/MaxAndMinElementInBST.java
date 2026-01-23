package BST;
import java.util.*;
public class MaxAndMinElementInBST {
    public static class Node{
        int val;
        Node left,right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (val < root.val)
            root.left = buildBST(root.left, val);
        else
            root.right = buildBST(root.right, val);
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    static int maximum (Node root){
        if (root == null) return 0;
        while(root.right!=null){
            root= root.right;
        }
        return root.val;
    }
    static int minimum (Node root){
        if (root == null) return 0;
        while(root.left!=null){
            root= root.left;
        }
        return root.val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.print("Enter nodes: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = buildBST(root, x);
        }
        System.out.print("Inorder of BST: ");
        inorder(root);
        System.out.println();

        System.out.println("Maximum: "+maximum(root));
        System.out.println("Minimum: "+minimum(root));

    }
}
