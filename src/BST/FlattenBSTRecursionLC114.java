package BST;
import java.util.*;
public class FlattenBSTRecursionLC114 {
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
    public static void flatten(Node root){
        if (root == null) return;
        if(root.left == null && root.right == null) return; //Single Node
        Node lst = root.left;
        Node rst = root.right;

        flatten(lst);
        flatten(rst);

        root.left = null;
        root.right = lst;
        Node temp = root;

        // temp = lst is also right.
        // But agar lst is null then it will give null pointer exception.

        while (temp.right != null){
            temp = temp.right;
        }
        temp.right = rst;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildBST(root, val);
        }
        flatten(root);
        System.out.print("Flatten to Linked List (Same as Preorder) : ");
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }
}

