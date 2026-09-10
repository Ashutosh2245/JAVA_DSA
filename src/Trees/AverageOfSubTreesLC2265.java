package Trees;
import java.util.*;
public class AverageOfSubTreesLC2265 {
    static int ans = 0;
    public static class Node{
        int val;
        Node left;
        Node right;
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
    public static int avgSubTree(Node root){
        dfs(root);
        return ans;
    }
    public static int[] dfs(Node root){
        int sum = 0, count = 0, avg = 0;
        if(root == null) return new int[] {0, 0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        sum = root.val + left[0] + right[0];
        count = 1 + left[1] + right[1];

        avg = sum/count;
        if(avg == root.val) ans++;
        return new int[] {sum, count};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Nodes: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr);
        int answer = avgSubTree(root);
        System.out.println("No of trees where root.val == average will be: "+answer);
    }
}
