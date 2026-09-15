package Trees;
import java.util.*;
public class SufficientNodeLC1080 {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node buildTree(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length){
            Node curr = q.poll();
            if(i < arr.length && arr[i] != -1){
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;

            if(i < arr.length && arr[i] != -1){
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static Node sufficient(Node root, int limit){
        return helper(root, 0, limit);
    }
    public static Node helper(Node root, int sum, int limit){
        if(root == null) return null;

        sum = sum + root.val;

        if(root.left == null && root.right == null){
            if (sum < limit) return null;
            else  return root;
        }

        root.left = helper(root.left, sum, limit);
        root.right = helper(root.right, sum, limit);

        if(root.left == null && root.right == null){
            return null;
        }
        return root;
    }

    public static void printTree(Node root){
        if (root == null) return;

        Queue <Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.val + " ");

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter nodes values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        Node root = buildTree(arr);
        root = sufficient(root, limit);
        printTree(root);
    }
}
