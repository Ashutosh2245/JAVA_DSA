package Trees;
import java.util.*;
public class BinaryTreePathsLC257 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    // Build binary tree from level-order input (-1 for null)
    public static TreeNode buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1)
            return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();
            // Left child
            if (i < arr.length && arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                q.offer(curr.left);
            }
            i++;
            // Right child
            if (i < arr.length && arr[i] != -1) {
                curr.right = new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    // Your solution logic
    public static class Solution {
        public static void path(TreeNode root, String s, List<String> ans) {
            if (root == null) return;
            if (root.left == null && root.right == null) {
                s += root.val;
                ans.add(s);
                return;
            }
            path(root.left, s + root.val + "->", ans);
            path(root.right, s + root.val + "->", ans);
        }
        public static List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            path(root, "", ans);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of tree nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the nodes: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        TreeNode root = buildTree(arr);
        List<String> result = Solution.binaryTreePaths(root);
        System.out.println("Binary Tree Paths are: ");
        for (String path : result) {
            System.out.println(path);
        }
        sc.close();
    }
}

