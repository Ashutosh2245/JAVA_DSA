// Method 1 -- >> Reverse Inorder then Level order insertion

/*package Heaps;
import java.util.*;
public class BSTToMaxHeap{
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node insertBST(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insertBST(root.left, val);
        else if (val > root.val) root.right = insertBST(root.right, val);
        return root;
    }

    public static void reverseInorder(Node root, List<Integer> list) {
        if (root == null) return;
        reverseInorder(root.right, list);
        list.add(root.val);
        reverseInorder(root.left, list);
    }

    public static Node buildMaxHeapLevelOrder(List<Integer> list) {
        if (list.isEmpty()) return null;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(list.get(0));
        q.add(root);

        int i = 1;
        while (i < list.size()) {
            Node curr = q.poll();

            curr.left = new Node(list.get(i++));
            q.add(curr.left);

            if (i < list.size()) {
                curr.right = new Node(list.get(i++));
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }

    public static void main(String[] args) {
        Node bst = null;
        int[] input = {4, 2, 6, 1, 3, 5, 7};

        for (int val : input)
            bst = insertBST(bst, val);

        List<Integer> list = new ArrayList<>();
        reverseInorder(bst, list);

        Node maxHeap = buildMaxHeapLevelOrder(list);

        System.out.println("Max Heap (Level Order):");
        levelOrder(maxHeap);
    }
}
*/

// METHOD 2 -->> Reverse Inorder then Preorder
// OverWriting

package Heaps;
import java.util.*;
public class BSTToMaxHeap {

    public static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public static void reverseInorder(Node root, List<Integer> list) {
        if (root == null) return;
        reverseInorder(root.right, list);
        list.add(root.val);
        reverseInorder(root.left, list);
    }
    public static void preorderFill(Node root, List<Integer> list, int[] idx) {
        if (root == null) return;
        root.val = list.get(idx[0]++);
        preorderFill(root.left, list, idx);
        preorderFill(root.right, list, idx);
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = null;
        int[] input = {4, 2, 6, 1, 3, 5, 7};

        for (int val : input) {
            root = insert(root, val);
        }

        List<Integer> list = new ArrayList<>();
        reverseInorder(root, list); // [7,6,5,4,3,2,1]

        int [] arr = new int[]{0};
        preorderFill(root, list, arr);

        System.out.println("Max Heap (Level Order):");
        levelOrder(root); // Output: 7 6 3 5 4 2 1
    }
}
