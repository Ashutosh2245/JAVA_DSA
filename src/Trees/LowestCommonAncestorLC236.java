// Using Depth First Search (DFS)
package Trees;
import java.util.*;
public class LowestCommonAncestorLC236 {
    public static class TreeNode {
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
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
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

        System.out.print("Enter first node value (p): ");
        int pVal = sc.nextInt();

        System.out.print("Enter second node value (q): ");
        int qVal = sc.nextInt();

        TreeNode root = buildTree(arr);
        TreeNode p = new TreeNode(pVal);
        TreeNode q = new TreeNode(qVal);
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + lca.val);

        sc.close();
    }
}




// O(N^2) in worst case

/*package Trees;
import java.util.*;
public class LowestCommonAncestorLC236 {
    public static class TreeNode {
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
    public static TreeNode lowestCommonAncestor(TreeNode root, int pVal, int qVal) {
        if (root == null || root.val == pVal || root.val == qVal)
            return root;
        boolean pLiesInLST = exists(root.left, pVal);
        boolean qLiesInLST = exists(root.left, qVal);
        if (pLiesInLST && qLiesInLST)
            return lowestCommonAncestor(root.left, pVal, qVal);
        else if (!pLiesInLST && !qLiesInLST)
            return lowestCommonAncestor(root.right, pVal, qVal);
        else
            return root;
    }

    public static boolean exists(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return exists(root.left, val) || exists(root.right, val);
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

        System.out.print("Enter first node value (p): ");
        int pVal = sc.nextInt();

        System.out.print("Enter second node value (q): ");
        int qVal = sc.nextInt();

        TreeNode root = buildTree(arr);
        TreeNode lca = lowestCommonAncestor(root, pVal, qVal);

        System.out.println("Lowest Common Ancestor: " + lca.val);

        sc.close();
    }
}*/
