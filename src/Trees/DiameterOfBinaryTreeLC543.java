package Trees;
public class DiameterOfBinaryTreeLC543 {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int rootDia = levels(root.left) + levels(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        return Math.max(rootDia, Math.max(leftDia, rightDia));
    }
    public static int levels(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(3);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        int diameter = diameterOfBinaryTree(a);
        System.out.println("Diameter of Tree: "+diameter);
    }
}

