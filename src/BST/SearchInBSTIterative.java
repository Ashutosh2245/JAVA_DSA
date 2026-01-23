// Iterative
package BST;
import java.util.*;
public class SearchInBSTIterative{
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)
                return root;
            else if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }
    public static TreeNode buildBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val < root.val)
            root.left = buildBST(root.left, val);
        else
            root.right = buildBST(root.right, val);
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();

        TreeNode root = null;

        System.out.print("Enter nodes: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = buildBST(root, x);
        }

        System.out.print("Inorder of BST: ");
        inorder(root);
        System.out.println();

        System.out.print("Enter the value to search: ");
        int val = sc.nextInt();
        TreeNode res = searchBST(root, val);

        if (res != null) {
            System.out.println("Found node: " + res.val);
            System.out.print("Subtree inorder: ");
            inorder(res);
        } else {
            System.out.println("Value not found");
        }
        sc.close();
    }
}

