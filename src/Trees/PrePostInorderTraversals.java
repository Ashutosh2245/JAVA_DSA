// TRAVERSAL IN NORMAL BINARY TREE
//METHOD 1

package Trees;
public class PrePostInorderTraversals {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.print("Preorder Traversal: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorder(a);
        System.out.println();
    }
}



// METHOD 2
/*package Trees;
import java.util.*;
public class PrePostInorderTraversals {
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    // Insert in Level Order (Simple Binary Tree)
    public static Node insert(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) return newNode;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }
    // Preorder: Root Left Right
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder: Left Root Right
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder: Left Right Root
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();

        sc.close();
    }
}
*/


// TRAVERSAL IN BINARY SEARCH TREE (BST)

/*package Trees;
import java.util.*;
public class PrePostInorderTraversals {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();

    }
}
 */


