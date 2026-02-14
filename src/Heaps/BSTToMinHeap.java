// Method 1 -- >> Using Inorder of bst then level wise insertion
package Heaps;
import java.util.*;
public class BSTToMinHeap{
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

    public static void inorder(Node root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
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
        inorder(bst, list);

        Node maxHeap = buildMaxHeapLevelOrder(list);

        System.out.println("Max Heap (Level Order):");
        levelOrder(maxHeap);
    }
}


// Method 2 -->> Using Inorder then preorder filling.
/*package Heaps;
import java.util.*;
public class BSTToMinHeap {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node insertBST(Node root, int val){
        if(root == null) return new Node(val);
        if(val < root.val){
            root.left = insertBST(root.left, val);
        }
        if(val > root.val){
            root.right = insertBST(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root, List <Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public static void preorderFill(Node root, List <Integer> list, int[] index){
        if(root == null) return;
        root.val = list.get(index[0]++);
        preorderFill(root.left, list, index);
        preorderFill(root.right, list, index);
    }
    public static void levelOrderPrint(Node root){
        if(root == null) return;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node = q.poll();
            System.out.print(node.val + " ");
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] input = {4,2,6,1,3,5,7};
        Node root = null;
        for(int val : input){
            root = insertBST(root, val);
        }
        List <Integer> list = new ArrayList<>();
        inorder(root, list);

        int[] index = new int[]{0};
        preorderFill(root, list, index);

        System.out.print("Min Heap (Level order): ");
        levelOrderPrint(root);
    }
}
*/