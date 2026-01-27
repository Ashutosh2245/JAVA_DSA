package BST;
import java.util.*;
public class MorrisTraversalInorder {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildBST(root.left,val);
        }
        else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    public static void morris(Node root){
        Node curr = root;
        while (curr != null){
            if(curr.left != null){
                Node predecessor = curr.left;
                while (predecessor.right != null && predecessor.right != curr){
                    predecessor = predecessor.right;
                }
                if(predecessor.right == null){ //Linking
                    predecessor.right = curr;
                    curr = curr.left;
                }
                else{ //predecessor.right == curr -->> Unlinking
                    predecessor.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;

                }
            }
            else{
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the nodes of BST: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildBST(root,val);
        }
        System.out.print("Morris Traversal (Inorder): ");
        morris(root);
    }
}
