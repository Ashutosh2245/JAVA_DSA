package BST;
import java.util.*;
public class FlattenBSTLC114UsingPreorderArray {
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
    public static void preorder(Node root, List <Node> arr){
        if (root == null) return;
        arr.add(root);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
    public static void flatten(Node root){
        ArrayList <Node> arr = new ArrayList<>();
        preorder(root,arr);
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if(i != n-1){
                arr.get(i).right = arr.get(i+1);
            }
            arr.get(i).left = null;
        }
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
