package Trees;
import java.util.*;
public class BTFromInAndPostorderLC106 {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node helper(int[] postorder, int[] inorder, int postLow, int postHi, int inLow, int inHi) {
        if (postLow > postHi || inLow > inHi) return null;

        Node root = new Node(postorder[postHi]);
        int r = inLow;
        while (inorder[r] != postorder[postHi]) {
            r++;
        }
        int leftSize = r - inLow;
        root.left = helper(postorder, inorder, postLow, postLow + leftSize - 1, inLow, r - 1);
        root.right = helper(postorder, inorder, postLow + leftSize, postHi - 1, r + 1, inHi);
        return root;
    }
    public static Node buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(postorder, inorder, 0, n - 1, 0, n - 1);
    }
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in inorder: ");
        int n = sc.nextInt();
        int[] inorder = new int[n];
        System.out.print("Enter inorder: ");
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements in postorder: ");
        int m = sc.nextInt();
        int[] postorder = new int[m];
        System.out.print("Enter postorder: ");
        for (int i = 0; i < m; i++) {
            postorder[i] = sc.nextInt();
        }
        Node root = buildTree(inorder, postorder);
        System.out.print("Inorder of constructed tree: ");
        printInorder(root);
    }
}
