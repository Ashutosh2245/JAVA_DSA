package BST;
import java.util.*;
public class GreatestSumTreeLC1038 {
    static int sum;
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if(root == null) return new Node(val);
        if(val < root.val){
            root.left = buildBST(root.left,val);
        }
        else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    public static void reverseInorder(Node root){
        if (root == null) return;
        reverseInorder(root.right);
        root.val += sum;
        sum = root.val;
        reverseInorder(root.left);
    }
    public static Node bstToGst(Node root){
        sum = 0;
        reverseInorder(root);
        return root;
    }
    public static void printInorder(Node root){
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val+" ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the BST Nodes: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = buildBST(root,x);
        }
        Node root1 = bstToGst(root);
        System.out.print("Inorder of Greater Sum Tree: ");
        printInorder(root1);
    }
}
