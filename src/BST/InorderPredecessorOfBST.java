// Method 1 -> Using an ArrayList -> Store in arraylist and return i+1 th index value.

package BST;
import java.util.*;
public class InorderPredecessorOfBST {
    static ArrayList <Integer> arr = new ArrayList<>();
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildTree(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildTree(root.left,val);
        }
        else {
            root.right = buildTree(root.right,val);
        }
        return root;
    }
    public static int inorderPredecessor(Node root, Node x){
        inorder(root);

        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) == x.val){
                return arr.get(i-1);
            }
        }
        return -1;
    }
    public static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the nodes of BST: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildTree(root,val);
        }
        System.out.print("Enter the node (Whose successor is required): ");
        int x = sc.nextInt();
        Node node = new Node(x);
        int predecessor = inorderPredecessor(root,node);
        System.out.println("Predecessor: "+predecessor);
    }
}


// Method 2 -->> Using left and right traversal

/*
package BST;
import java.util.*;
public class InorderPredecessorOfBST {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildTree(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildTree(root.left,val);
        }
        else {
            root.right = buildTree(root.right,val);
        }
        return root;
    }
    public static int inorderPredecessor(Node root, Node x){
        Node predecessor = null;
        while(root != null){
            if(x.val > root.val){
                predecessor = root;
                root = root.right;
            }
            else root = root.left;
        }
        if(predecessor == null) return -1;
        else return predecessor.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the nodes of BST: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildTree(root,val);
        }
        System.out.print("Enter the node (Whose successor is required): ");
        int x = sc.nextInt();
        Node node = new Node(x);
        int predecessor = inorderPredecessor(root,node);
        System.out.println("Predecessor: "+predecessor);
    }
}
*/
