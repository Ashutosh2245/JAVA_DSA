/* package BST;
import java.util.*;
public class PredecessorAndSuccessor{
    static ArrayList<Integer> arr = new ArrayList<>();

    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    static Node buildTree(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.val)
            root.left = buildTree(root.left, val);
        else
            root.right = buildTree(root.right, val);

        return root;
    }
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    static Integer inorderPredecessor(Node root, int key) {
        arr.clear();
        inorder(root);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                return arr.get(i - 1);
            }
        }
        return null;
    }

    static Integer inorderSuccessor(Node root, int key) {
        arr.clear();
        inorder(root);

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == key) {
                return arr.get(i + 1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.print("Enter nodes of BST: ");
        for (int i = 0; i < n; i++) {
            root = buildTree(root, sc.nextInt());
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        Integer pred = inorderPredecessor(root, key);
        Integer succ = inorderSuccessor(root, key);


        System.out.print("Predecessor of "+key+" : ");
        if (pred != null)
            System.out.println(pred);
        else
            System.out.println("null");

        System.out.print("Successor of "+key+" : ");
        if (succ != null)
            System.out.println(succ);
        else
            System.out.println("null");
    }
}
*/

package BST;
import java.util.*;
public class PredecessorAndSuccessor {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node buildTree(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.val)
            root.left = buildTree(root.left, val);
        else
            root.right = buildTree(root.right, val);

        return root;
    }

    public static ArrayList<Node> findPreSuc(Node root, int key) {

        arr.clear();
        inorder(root);

        Node predecessor = null;
        Node successor = null;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) < key) {
                predecessor = new Node(arr.get(i));
            }

            if (arr.get(i) > key) {
                successor = new Node(arr.get(i));
                break;
            }
        }

        ArrayList<Node> ans = new ArrayList<>();
        ans.add(predecessor);   // index 0
        ans.add(successor);     // index 1

        return ans;
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;

        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            root = buildTree(root, sc.nextInt());
        }

        System.out.print("Enter Key value: ");
        int key = sc.nextInt();

        ArrayList<Node> arr = findPreSuc(root, key);

        System.out.print("Predecessor & Successor: ");
        if (arr.get(0) == null) {
            System.out.print("-1 ");
        } else {
            System.out.print(arr.get(0).val + " ");
        }


        if (arr.get(1) == null) {
            System.out.print("-1");
        } else {
            System.out.print(arr.get(1).val);
        }
    }
}