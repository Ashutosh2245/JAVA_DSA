package BST;
import java.util.*;
public class LevelOrderTraversalBST {
    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
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


    // LEVEL ORDER TRAVERSAL (PRINT)
    public static void levelOrderPrint(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.val + " ");

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == -1) continue;   // skip nulls
            root = buildBST(root, val);
        }

        System.out.println("Level Order Traversal:");
        levelOrderPrint(root);
    }
}
