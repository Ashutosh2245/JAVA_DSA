package BST;
import java.util.*;
public class RangeSumOfBSTLC938 {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if (root == null) return new Node(val);

        if (val == root.val) {
            return root;
        }
        else if(val< root.val) {
            root.left = buildBST(root.left,val);
        }
        else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static int rangeSum(Node root, int low, int high){
        if (root == null) return 0;
        if(root.val<low){
            return rangeSum(root.right,low,high);
        }
        if(root.val>high){
            return rangeSum(root.right,low,high);
        }
        return root.val + rangeSum(root.right,low,high) + rangeSum(root.left,low,high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Node root = null;
        System.out.print("Enter no of nodes in BST: ");
        int n = sc.nextInt();
        System.out.print("Enter nodes: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildBST(root,val);
        }
        System.out.print("Enter low: ");
        int low = sc.nextInt();
        System.out.print("Enter high: ");
        int high = sc.nextInt();
        System.out.print("Enter order of BST: ");
        inorder(root);
        System.out.print("Range sum: "+rangeSum(root,low,high));
    }
}
