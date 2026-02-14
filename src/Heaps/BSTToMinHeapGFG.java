// Reverse Inorder then PostOrder

package Heaps;
import java.util.*;
public class BSTToMinHeapGFG {

    public static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public static void revInorder(Node root, List<Integer> list) {
        if (root == null) return;
        revInorder(root.right, list);
        list.add(root.val);
        revInorder(root.left, list);
    }
    public static void postOrderFill(Node root, List<Integer> list, int[] idx) {
        if (root == null) return;
        postOrderFill(root.left, list, idx);
        postOrderFill(root.right, list, idx);
        root.val = list.get(idx[0]++);
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = null;
        int[] input = {4, 2, 6, 1, 3, 5, 7};

        for (int val : input) {
            root = insert(root, val);
        }

        List<Integer> list = new ArrayList<>();
        revInorder(root, list);

        int [] arr = new int[]{0};
        postOrderFill(root, list, arr);

        System.out.println("Min Heap (Level Order):");
        levelOrder(root);
    }
}
