package Trees;
import java.util.*;
public class BalancedBTLC110 {
    static boolean ans;
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
    public static int levels(Node root){
        if(root == null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        int diff = Math.abs(leftLevels - rightLevels);
        if (diff > 1) ans = false;
        return 1 + Math.max(leftLevels, rightLevels);
    }
    public static boolean isBalanced(Node root) {
        ans = true;
        levels(root); //TC = O(n)
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
        Node root = BuildBT(arr);
        System.out.print("Binary tree is balanced? : "+isBalanced(root));
    }
}
