package Trees;
import java.util.*;
public class PathSum3LC437{
    public static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }
    public static Node BuildBT(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i<arr.length){
            Node curr = q.poll();
            if(i<arr.length && arr[i] != -1){
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
    public static int helper(Node root, long sum) {
        if(root == null) return 0;
        int count = 0;
        if(root.val == sum) count++;
        count += helper(root.left,sum-root.val) + helper(root.right,sum-root.val);
        return count;
    }
    public static int pathSum(Node root, int sum){
        if(root == null) return 0;
        return helper(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
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
        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        Node root = BuildBT(arr);

        System.out.println("Paths with given sum:");
        System.out.println(pathSum(root, targetSum));
    }
}
