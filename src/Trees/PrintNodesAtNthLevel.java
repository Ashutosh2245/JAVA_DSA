package Trees;
import java.util.*;
public class PrintNodesAtNthLevel {
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
    static void printNthLevel(TreeNode root, int level) {
        if (root == null || level < 1) {
            System.out.println("Level not found");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int currLevel = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            if (currLevel == level) {
                while (size-- > 0) {
                    System.out.print(q.poll().val + " ");
                }
                return;
            }
            while (size-- > 0) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            currLevel++;
        }
        System.out.println("Level not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of tree nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the tree nodes: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Nth level(Which has to be print): ");
        int level = sc.nextInt();
        System.out.print("Nth level: ");
        TreeNode root = buildTree(arr);
        printNthLevel(root, level);
        sc.close();
    }
}
