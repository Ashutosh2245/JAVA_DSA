package BST;
import java.util.*;
public class BalanceABSTLC1382 {
    static ArrayList<Node> arr = new ArrayList<>();
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node balanceBST(Node root) {
        if (root == null) return null;
        arr.clear();
        inorder(root);
        return buildTree(0, arr.size() - 1);
    }

    public static Node buildTree(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        Node root = arr.get(mid);

        root.left = buildTree(left, mid - 1);
        root.right = buildTree(mid + 1, right);

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.val) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();

        Node root = null;
        System.out.print("Enter the nodes of BST: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildBST(root, val);
        }

        Node root1 = balanceBST(root);
        System.out.print("Inorder of Balanced BST: ");
        printInorder(root1);
    }
}
