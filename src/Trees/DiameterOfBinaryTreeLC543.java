// Optimized Method - O(n)
// METHOD 2
package Trees;
import java.util.*;
public class DiameterOfBinaryTreeLC543 {
    static int diameter = 0;
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node BuildTree(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i<arr.length ){
            Node curr = q.poll();
            if(i<arr.length && arr[i]!= -1){
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;
            if(i<arr.length && arr[i] != -1){
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static int levels(Node root){
        if(root == null) return 0;
        int leftLvl = levels(root.left);
        int rightLvl = levels(root.right);
        diameter = Math.max(diameter, leftLvl+rightLvl);
        return 1 + Math.max(leftLvl,rightLvl);
    }
    public static int diameterOfBT(Node root){
        diameter = 0;
        levels(root);
        return diameter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the tree nodes: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = BuildTree(arr);
        System.out.print("Diameter of Binary Tree: "+diameterOfBT(root));
    }
}
/*package Trees;
public class DiameterOfBinaryTreeLC543 {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int rootDia = levels(root.left) + levels(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        return Math.max(rootDia, Math.max(leftDia, rightDia));
    }
    public static int levels(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(3);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        int diameter = diameterOfBinaryTree(a);
        System.out.println("Diameter of Tree: "+diameter);
    }
}
*/