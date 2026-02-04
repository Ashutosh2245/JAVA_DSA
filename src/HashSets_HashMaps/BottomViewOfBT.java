package HashSets_HashMaps;
import java.util.*;
public class BottomViewOfBT {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    static class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
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

    static void bottomView(TreeNode root) {
        if (root == null) return;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int minLevel = 0, maxLevel = 0;
        while (!q.isEmpty()) {
            Pair temp = q.remove();
            TreeNode node = temp.node;
            int lvl = temp.level;
            map.put(lvl, node.val);
            minLevel = Math.min(minLevel, lvl);
            maxLevel = Math.max(maxLevel, lvl);

            if (node.left != null)
                q.add(new Pair(node.left, lvl - 1));
            if (node.right != null)
                q.add(new Pair(node.right, lvl + 1));
        }

        for (int i = minLevel; i <= maxLevel; i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of nodes in BT: ");
        int n = sc.nextInt();

        System.out.print("Enter BT nodes: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = buildTree(arr);

        System.out.print("Bottom View: ");
        bottomView(root);
    }
}



// GFG STYLE

/*package HashSets_HashMaps;
import java.util.*;
public class BottomViewOfBT {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    static Node buildTree(int[] arr) {
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
    static List<Integer> bottomView(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;

            map.put(hd, node.data);

            if (node.left != null)
                q.add(new Pair(node.left, hd - 1));

            if (node.right != null)
                q.add(new Pair(node.right, hd + 1));
        }

        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter nodes (level order, -1 for null):");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr);

        List<Integer> ans = bottomView(root);
        System.out.print("Bottom View: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
*/
