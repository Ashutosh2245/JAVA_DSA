// BINARY TREES

package Trees;
public class SymmetricTreeLC101 {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode (int val){
            this.val = val;
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        invert(root.left);
        boolean ans = (isSameTree(root.left,root.right));
        invert(root.left);
        return ans;
    }
    public static void invert(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
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
        System.out.print("Is the given binary tree is symmetric: "+isSymmetric(a));
    }
}

// BINARY SEARCH TREES

/*package Trees;
import java.util.*;
public class SymmetricTreeLC101 {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode (int val){
            this.val = val;
        }
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(val< root.val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        invert(root.left);
        boolean ans = (isSameTree(root.left,root.right));
        invert(root.left);
        return ans;

    }
    public static void invert(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        // if(p==null && q!=null) return false;
        // if(p!=null && q==null) return false;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        System.out.print("Enter the no of nodes in binary tree: ");
        int n = sc.nextInt();
        System.out.print("Enter the nodes of binary tree: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root,val);
        }
        System.out.print("Is the given binary tree is symmetric: "+isSymmetric(root));

    }
}*/