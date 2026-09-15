package Trees;
import java.util.*;
public class SumOfAllRootToLeafPaths {
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

        Queue <Node> q = new LinkedList<>();
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
    public static ArrayList <Integer> sum(Node root, int sum){
        ArrayList <Integer> ans = new ArrayList<>();
        helper(root, sum, ans);
        return ans;
    }
    public static void helper(Node root, int sum, ArrayList <Integer> ans){
        if(root == null) return;

        sum = sum + root.val;
        if(root.left == null && root.right == null){
            ans.add(sum);
            return;
        }
        helper(root.left, sum, ans);
        helper(root.right, sum, ans);
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
        Node root = buildTree(arr);
        ArrayList <Integer> ans = sum(root, 0);
        System.out.println(ans);
    }
}
