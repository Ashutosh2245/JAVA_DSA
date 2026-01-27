package BST;
import java.util.*;
public class TrimBSTLC669 {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public static Node trimBST(Node root, int low, int high){
        if (root == null) return null;

        if(root.val < low){
            return trimBST(root.right, low, high);
        }
        if(root.val > high){
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
    public static void printInorder(Node root){
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
        System.out.print("Enter low: ");
        int low = sc.nextInt();
        System.out.print("Enter high: ");
        int high = sc.nextInt();
        Node ans = trimBST(root, low, high);
        System.out.print("Trimmed BST(Inorder) : ");
        printInorder(ans);

    }
}
