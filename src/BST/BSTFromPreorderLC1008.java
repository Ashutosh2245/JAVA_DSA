package BST;
import java.util.*;
public class BSTFromPreorderLC1008 {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node bstFromPreorder(int[] preorder){
        Node root = new Node(preorder[0]);
        int n = preorder.length;
        for (int i = 1; i < n; i++) {
            root = insertIntoBST(root,preorder[i]);
        }
        return root;

    }
    public static Node insertIntoBST(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            if(root.left == null) root.left =  new Node(val);
            else insertIntoBST(root.left,val);
        }
        else{
            if(root.right == null) root.right = new Node(val);
            else insertIntoBST(root.right,val);
        }
        return root;
    }
    public static void printInorder(Node root){
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val+" ");
        printInorder(root.right);
    }
    public static void printLevelOrder(Node root){
        if (root == null) return;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.val+" ");

            if (curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in preorder: ");
        int n = sc.nextInt();
        int[] preorder = new int[n];
        System.out.print("Enter the elements in preorder: ");
        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        Node root = bstFromPreorder(preorder);
        System.out.print("Inorder of the BST: ");
        printInorder(root);
        System.out.println();
        System.out.print("(BFS) Level order of the BST: ");
        printLevelOrder(root);

    }
}
