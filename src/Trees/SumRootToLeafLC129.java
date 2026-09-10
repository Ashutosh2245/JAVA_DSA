package Trees;
import java.util.*;
public class SumRootToLeafLC129 {
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

        Node root = new Node(arr[0]);
        Queue <Node> q = new LinkedList<>();
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
    public static int sumRootToLeaf(Node root){
        return solve(root, 0);
    }
    public static int solve(Node root, int sum){
        if(root == null) return 0;

        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return solve(root.left ,sum) + solve(root.right, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the nodes values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr);
        int ans = sumRootToLeaf(root);
        System.out.println("Sum from Root to Leaf: "+ans);
    }
}
