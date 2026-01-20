// Using BackTracking
package Trees;
import java.util.*;
public class PathSum2LC113Optimized {
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public static Node BuildBT(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node curr = q.poll();

            if (i < arr.length && arr[i] != -1) {
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != -1) {
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void helper(Node root, int target, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) return;
        path.add(root.val);

        if (root.left == null && root.right == null && root.val == target) {
            ans.add(new ArrayList<>(path)); // deep copy
        } else {
            helper(root.left, target - root.val, path, ans);
            helper(root.right, target - root.val, path, ans);
        }
        // backtracking
        path.remove(path.size() - 1);
    }
    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter tree nodes (-1 for null): ");
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
