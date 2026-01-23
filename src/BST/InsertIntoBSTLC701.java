package BST;
import java.util.*;
public class InsertIntoBSTLC701 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    // Build BST from input values
    public static TreeNode buildBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = buildBST(root.left, val);
        else
            root.right = buildBST(root.right, val);

        return root;
    }
    //Recursive Method

    /*public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }*/

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode cur = root;
        while (true) {
            if (val < cur.val) {
                if (cur.left == null) {
                    cur.left = new TreeNode(val);
                    break;
                }
                cur = cur.left;
            } else {
                if (cur.right == null) {
                    cur.right = new TreeNode(val);
                    break;
                }
                cur = cur.right;
            }
        }
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
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter BST values (-1 for null):");
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == -1) continue;
            root = buildBST(root, val);
        }
        System.out.print("Enter value to insert: ");
        int insertVal = sc.nextInt();
        root = insertIntoBST(root, insertVal);
        System.out.println("Inorder after insertion:");
        inorder(root);
    }
}
