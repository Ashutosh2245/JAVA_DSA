package Trees;
import java.util.*;
public class PrintNodesAtNthLevel {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    static TreeNode buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1)
            return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();
            if (i < arr.length && arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                q.offer(curr.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                curr.right = new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    static void printNthLevel(TreeNode root, int level) {
        if (root == null || level < 1) {
            System.out.println("Level not found");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int currLevel = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            if (currLevel == level) {
                while (size-- > 0) {
                    System.out.print(q.remove().val + " ");
                }
                return;
            }
            while (size-- > 0) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            currLevel++;
        }
        System.out.println("Level not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of tree nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the tree nodes: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Nth level(Which has to be print): ");
        int level = sc.nextInt();
        System.out.print("Nth level: ");
        TreeNode root = buildTree(arr);
        printNthLevel(root, level);
        sc.close();
    }
}


// Method 2
/*package Trees;
import java.util.*;
public class PrintNodesAtNthLevel {
    static int n;
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
    public static void levelOrderLToR(Node root){
        Queue <Node> q = new LinkedList<>();
        if (root!=null) q.add(root);
        while (!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    public static void nThLevel(Node root, int level){
        if (root == null) return;
        if(level==n) System.out.print(root.val + " ");
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
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
        System.out.print("LevelOrder Traversal(Left To Right): ");
        levelOrderLToR(a);
        System.out.print("Enter level: ");
        n = sc.nextInt();
        System.out.println("Elements till nth level: ");
        for (int i = 0; i <3 ; i++) {
            n = i;
            nThLevel(a,0);
            System.out.println();
        }
        System.out.print("Elements at nth level: ");
        nThLevel(a,0);
    }
}
*/