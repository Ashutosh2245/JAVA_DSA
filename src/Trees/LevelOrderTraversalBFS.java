package Trees;
import java.util.*;
public class LevelOrderTraversalBFS {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void levelOrderLToR(Node root){
        Queue <Node> q = new LinkedList<>();
        if (root!=null) q.add(root);
        while (!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    public static void levelOrderRToL(Node root){
        Queue <Node> q = new LinkedList<>();
        if (root!=null) q.add(root);
        while (!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
        System.out.println();
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
        System.out.print("Preorder Traversal: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorder(a);
        System.out.println();
        System.out.print("LevelOrder Traversal(Left To Right): ");
        levelOrderLToR(a);
        //System.out.println();
        System.out.print("LevelOrder Traversal(Right To Left): ");
        levelOrderRToL(a);
    }
}
