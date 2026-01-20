package Trees;
import java.util.*;
public class RightSideViewLC199 {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
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
        while (!q.isEmpty() && i<arr.length){
            Node curr = q.poll();
            if(i < arr.length && arr[i] != -1){
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
        return 1 + Math.max(levels(root.left),levels(root.right) );
    }
    public static void dfs(Node root, int level, List<Integer> ans){
        if(root == null) return;
        ans.set(level,root.val);
        dfs(root.left,level+1,ans);
        dfs(root.right,level+1,ans);
    }
    public static List <Integer> rightSideView(Node root){
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        dfs(root,0,ans);
        return ans;
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
        Node root = buildTree(arr);
        List <Integer> result = rightSideView(root);
        System.out.print("Right side view of binary tree: ");
        System.out.println(result);
    }
}
