package Trees;
import java.util.*;
public class BTFromInAndPreorderLC105 {
    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node helper(int[] preorder, int[] inorder, int preLow, int preHi, int inLow, int inHi) {
        if (preLow > preHi || inLow > inHi) return null;
        Node root = new Node(preorder[preLow]);
        int r = inLow;
        while (inorder[r] != preorder[preLow]) {
            r++;
        }
        int leftSize = r - inLow;
        root.left = helper(preorder, inorder, preLow + 1, preLow + leftSize, inLow, r - 1);
        root.right = helper(preorder, inorder, preLow + leftSize + 1, preHi, r + 1, inHi);
        return root;
    }

    public static Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
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

        System.out.print("Enter number of elements in preorder: ");
        int m = sc.nextInt();
        int[] preorder = new int[m];

        System.out.print("Enter preorder: ");
        for (int i = 0; i < m; i++) {
            preorder[i] = sc.nextInt();
        }

        Node root = buildTree(preorder, inorder);
        System.out.print("Inorder of constructed tree: ");
        printInorder(root);
        sc.close();
    }
}
