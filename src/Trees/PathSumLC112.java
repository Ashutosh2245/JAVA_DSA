package Trees;
import java.util.*;
public class PathSumLC112 {
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
    static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tree nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the tree nodes (level order, -1 for null): ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();
        TreeNode root = buildTree(arr);
        boolean result = hasPathSum(root, targetSum);
        System.out.println("Path Sum Exists: " + result);
        sc.close();
    }
}
